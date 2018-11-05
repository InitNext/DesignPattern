package com.cyl.hello.designpattern.factorymethod;

public class BCreatorImpl implements Creator {
    @Override
    public IProduct createProduct() {
        return new BProductImpl();
    }
}
