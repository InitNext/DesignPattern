package com.cyl.hello.designpattern.factorymethod;

public class ACreatorImpl implements Creator {
    @Override
    public IProduct createProduct() {
        return new AProductImpl();
    }
}
