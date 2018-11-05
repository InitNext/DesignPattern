package com.cyl.hello.designpattern.abstractfactory;

public class Creator2Impl implements Creator {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
