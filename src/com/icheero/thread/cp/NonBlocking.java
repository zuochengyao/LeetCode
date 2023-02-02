package com.icheero.thread.cp;

import java.util.PriorityQueue;

/**
 * @author Work
 * @date 2023-02-01
 */
public class NonBlocking {
    private static final Object LOCK = new Object();
    private static final int QUEUE_SIZE = 10;
    private PriorityQueue<Integer> queue = new PriorityQueue<>(QUEUE_SIZE);
    private volatile boolean running = true;

    public void startRunner() {
        new Thread(new Consumer(), "Consumer").start();
        new Thread(new Producer(), "Producer").start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stopRunner();
    }

    private void stopRunner() {
        running = false;
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            while (running) {
                synchronized (LOCK) {
                    while (queue.size() == 0) {
                        System.out.println("队列空，等待");
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    queue.poll();
                    System.out.println(Thread.currentThread().getName() + ", 队列剩余: " + queue.size());
                    LOCK.notify();
                }
            }
        }
    }

    class Producer implements Runnable {
        @Override
        public void run() {
            while (running) {
                synchronized (LOCK) {
                    while (queue.size() == QUEUE_SIZE) {
                        System.out.println("队列满，等待");
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    queue.offer(1);
                    System.out.println(Thread.currentThread().getName() + ", 队列剩余: " + queue.size());
                    LOCK.notify();
                }
            }
        }
    }
}
