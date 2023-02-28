package com.icheero.theory.thread;

import com.icheero.theory.thread.cp.NonBlocking;

/**
 * @author Work
 * @date 2023-02-01
 */
public class ThreadMain {
    public static void main(String[] args) {
        new NonBlocking().startRunner();
    }
}
