package com.cyl.hello.designpattern.staticfactory;

public class Creater {

    private Creater(){}

    public static IFactory createFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        }

        if (factoryName.equals("A")) {
            return new AFactoryImpl();
        } else if (factoryName.equals("B")) {
            return new BFactoryImpl();
        }

        return null;
    }
}
