package com.icheero.theory.designpattern.creational.factory;

/**
 * @author Work
 * @date 2023-02-03
 */
public class RealProduct implements IProduct {
   @Override
   public void product() {
      System.out.println("RealProduct");
   }
}
