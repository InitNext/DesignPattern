package com.cyl.hello.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnLazyVariantSingletonTest {

    @Test
    public void getInstance() {
        UnLazyVariantSingleton singleton = UnLazyVariantSingleton.getInstance();
        Assert.assertNotEquals("成功获取实例", null, singleton);
    }
}