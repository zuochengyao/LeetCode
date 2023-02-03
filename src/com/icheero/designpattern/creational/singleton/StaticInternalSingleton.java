package com.icheero.designpattern.creational.singleton;

/**
 * @author Work
 * @date 2023-02-03
 */
class StaticInternalSingleton {
    private StaticInternalSingleton() { }

    public static StaticInternalSingleton getInstance() {
        return StaticInternalSingletonHolder.instance;
    }

    private static class StaticInternalSingletonHolder {
        private static final StaticInternalSingleton instance = new StaticInternalSingleton();
    }
}
