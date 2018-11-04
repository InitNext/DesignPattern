package com.cyl.hello.designpattern.singleton;

/**
 * 懒汉，变种写法
 */
public class UnLazyVariantSingleton {

    private static UnLazyVariantSingleton instance=null;
    static{
        instance = new UnLazyVariantSingleton();
    }
    public static UnLazyVariantSingleton getInstance(){
        return instance;
    }

}
