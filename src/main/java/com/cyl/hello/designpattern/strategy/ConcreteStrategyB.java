package com.cyl.hello.designpattern.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("采用策略B计算");
    }
}
