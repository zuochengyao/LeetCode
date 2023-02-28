package com.icheero.theory.designpattern.creational.singleton;

/**
 * @author Work
 * @date 2023-02-03
 */
class EagerSingleton {
   private static EagerSingleton mInstance = new EagerSingleton();

   private EagerSingleton() {}

   public static EagerSingleton getInstance() {
      return mInstance;
   }
}
