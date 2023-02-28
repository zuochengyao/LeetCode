package com.icheero.practice.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.cn/problems/implement-stack-using-queues">225. 队列实现栈</a>
 * <p>
 * void push(int x) 将元素 x 压入栈顶。
 * <p>
 * int pop() 移除并返回栈顶元素。
 * <p>
 * int top() 返回栈顶元素。
 * <p>
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false
 *
 * @author Work
 * @date 2023-02-17
 */
class Queue2Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.offer(x);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        Queue<Integer> tmpQueue = q1;
        q1 = q2;
        q2 = tmpQueue;
    }

    public int pop() {
        return q2.poll();
    }

    public int top() {
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty();
    }
}
