package com.icheero.designpattern.creational.factory;

/**
 * @author Work
 * @date 2023-02-03
 */
public class RealFactory extends AbstractFactory {
    @Override
    public <T extends IProduct> T createProduct(Class<T> clz) {
        IProduct product;
        String className = clz.getName();
        try {
            product = (IProduct) Class.forName(className).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return (T) product;
    }
}
