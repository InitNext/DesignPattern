package com.cyl.hello.designpattern.singleton;

/**
 * 双重校验， 1.5之前使用会有问题
 */
public class DoubleCheckSingleton {

    //加入volatile防止指定重排序
    private volatile static DoubleCheckSingleton instance;
    //private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
