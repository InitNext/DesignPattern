package com.cyl.hello.designpattern.strategy;

public class ConcreteStrategyC implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("采用策略C计算");
    }
}
