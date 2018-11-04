package com.cyl.hello.designpattern.staticfactory;

import org.junit.Assert;
import org.junit.Test;

public class CreaterTest {

    @Test
    public void nullTest() {
        IFactory factory = Creater.createFactory(null);
        Assert.assertEquals(null, factory);
    }

    @Test
    public void aFactoryImplTest() {
        IFactory factory = Creater.createFactory("A");
        Assert.assertEquals("这里生成的工厂不是Ａ", "hi, this is a factory implement", factory.method());
    }

    @Test
    public void bFactoryImplTest() {
        IFactory factory = Creater.createFactory("B");
        Assert.assertEquals("这里生成的工厂不是B", "hi, this is b factory implement", factory.method());
    }
}