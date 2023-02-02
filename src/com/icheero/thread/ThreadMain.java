package com.icheero.thread;

import com.icheero.thread.cp.NonBlocking;

/**
 * @author Work
 * @date 2023-02-01
 */
public class ThreadMain {
    public static void main(String[] args) {
        new NonBlocking().startRunner();
    }
}
