package com.cyl.hello.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LazySafeSingletonTest {

    @Test
    public void getInstance() {
        LazySafeSingleton singleton = LazySafeSingleton.getInstance();
        Assert.assertNotEquals("成功获取实例", null, singleton);
    }

}