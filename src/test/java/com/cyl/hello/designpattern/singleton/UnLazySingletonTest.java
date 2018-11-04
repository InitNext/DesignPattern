package com.cyl.hello.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnLazySingletonTest {

    @Test
    public void getInstance() {
        UnLazySingleton singleton = UnLazySingleton.getInstance();
        Assert.assertNotEquals("成功获取实例", null, singleton);
    }
}