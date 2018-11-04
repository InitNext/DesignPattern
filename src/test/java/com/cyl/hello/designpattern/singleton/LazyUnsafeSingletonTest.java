package com.cyl.hello.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class LazyUnsafeSingletonTest {

    Set<String> set = new HashSet<>();

    @Test
    public void getInstance() {
        //for(int i = 0; i < 100; i++) {
        //    new Thread(new SingletonThread()).start();
        //}
        //Assert.assertEquals(1, set.size());
        LazyUnsafeSingleton singleton = LazyUnsafeSingleton.getInstance();
        Assert.assertNotEquals("成功获取实例", null, singleton);
    }

    class SingletonThread implements Runnable {
        @Override
        public void run() {
            String address = EnumSingleton.INSTANCE.toString();
            System.out.print(address);
            set.add(address);
        }
    }
}