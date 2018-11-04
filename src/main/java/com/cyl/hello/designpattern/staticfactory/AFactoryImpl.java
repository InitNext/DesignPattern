package com.cyl.hello.designpattern.staticfactory;

public class AFactoryImpl implements IFactory {
    @Override
    public String method() {
        return "hi, this is a factory implement";
    }
}
