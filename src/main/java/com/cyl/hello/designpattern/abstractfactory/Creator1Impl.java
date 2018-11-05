package com.cyl.hello.designpattern.abstractfactory;

public class Creator1Impl implements Creator {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
