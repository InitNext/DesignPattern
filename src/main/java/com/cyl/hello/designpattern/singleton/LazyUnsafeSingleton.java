package com.cyl.hello.designpattern.singleton;

/**
 * 懒汉、线程不安全
 */
public class LazyUnsafeSingleton {

    private static LazyUnsafeSingleton instance;

    private LazyUnsafeSingleton(){}

    public static LazyUnsafeSingleton getInstance(){
        if(instance == null) {
            instance = new LazyUnsafeSingleton();
        }
        return instance;
    }
}
