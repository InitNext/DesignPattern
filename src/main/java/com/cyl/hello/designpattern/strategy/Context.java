package com.cyl.hello.designpattern.strategy;

public class Context {

    Strategy strategy;

    public void method(){
        strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
