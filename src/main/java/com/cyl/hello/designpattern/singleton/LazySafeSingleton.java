package com.cyl.hello.designpattern.singleton;

/**
 * 懒汉、线程安全、效率低
 */
public class LazySafeSingleton {

    private static LazySafeSingleton instance;

    private LazySafeSingleton(){}

    public static synchronized LazySafeSingleton getInstance() {
        if(instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
