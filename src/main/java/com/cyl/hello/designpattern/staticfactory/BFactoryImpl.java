package com.cyl.hello.designpattern.staticfactory;

public class BFactoryImpl implements IFactory {
    @Override
    public String method() {
        return "hi, this is b factory implement";
    }
}
