package com.cyl.hello.designpattern.observer;

public class ConcreteMyObserver2 implements MyObserver {
    @Override
    public void update(MyObservable o) {
        System.out.println("观察者2观察到" + o.getClass().getSimpleName() + "发生变化");
        System.out.println("观察者2做出相应");
    }
}
