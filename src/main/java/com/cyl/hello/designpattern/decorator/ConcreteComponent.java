package com.cyl.hello.designpattern.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("原来的方法");
    }
}
