package com.icheero.theory.designpattern.creational.factory;

/**
 * @author Work
 * @date 2023-02-03
 */
public abstract class AbstractFactory {
    public abstract <T extends IProduct> T createProduct(Class<T> clz);
}
