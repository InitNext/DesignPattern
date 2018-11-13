package com.cyl.hello.designpattern.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void method() {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.method();

        context.setStrategy(new ConcreteStrategyB());
        context.method();

        context.setStrategy(new ConcreteStrategyC());
        context.method();
    }
}