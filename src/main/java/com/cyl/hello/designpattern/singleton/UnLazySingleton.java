package com.cyl.hello.designpattern.singleton;

/**
 * 饿汉
 * （譬如 Singleton 实例的创建是依赖参数或者配置文件的，
 * 在 getInstance() 之前必须调用某个方法设置参数给它，
 * 那样这种单例写法就无法使用了）
 */
public class UnLazySingleton {

    private static final UnLazySingleton INSTANCE = new UnLazySingleton();

    private UnLazySingleton(){}

    public static UnLazySingleton getInstance(){
        return INSTANCE;
    }
}
