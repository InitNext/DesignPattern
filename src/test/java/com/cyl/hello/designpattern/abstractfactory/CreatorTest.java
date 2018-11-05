package com.cyl.hello.designpattern.abstractfactory;

import org.junit.Test;

public class CreatorTest {

    @Test
    public void creator() {
        Creator creator = new Creator1Impl();
        ProductA productA = creator.createProductA();
        ProductB productB = creator.createProductB();
        productA.methodA();
        productB.methodB();

        creator = new Creator2Impl();
        productA = creator.createProductA();
        productB = creator.createProductB();
        productA.methodA();
        productB.methodB();
    }
}