package com.cyl.hello.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyObservable {

    List<MyObserver> myObservers = new ArrayList<MyObserver>();

    public void addObserver(MyObserver o){
        myObservers.add(o);
    }

    public void changed(){
        System.out.println("我是被观察者，我已经发生变化了");
        notifyObservers();//通知观察自己的所有观察者
    }

    public void notifyObservers(){
        for (MyObserver myObserver : myObservers) {
            myObserver.update(this);
        }
    }
}
