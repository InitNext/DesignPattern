package com.cyl.hello.designpattern.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("采用策略A计算");
    }
}
