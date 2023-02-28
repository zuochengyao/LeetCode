package com.icheero.theory.designpattern.creational.singleton;

/**
 * @author Work
 * @date 2023-02-03
 */
class LazySingleton {
    private LazySingleton() { }

    private volatile static LazySingleton mInstance;

    public static LazySingleton getInstance() {
        if (mInstance == null) {
            synchronized (LazySingleton.class) {
                if (mInstance == null) {
                    mInstance = new LazySingleton();
                }
            }
        }
        return mInstance;
    }
}
