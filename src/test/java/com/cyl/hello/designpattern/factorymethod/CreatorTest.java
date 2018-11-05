package com.cyl.hello.designpattern.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class CreatorTest {

    @Test
    public void createAProduct() {
        Creator creator = new ACreatorImpl();
        IProduct product = creator.createProduct();
        Assert.assertEquals("这不是产品A", "I am a product", product.getName());
    }

    @Test
    public void createBProduct() {
        Creator creator = new BCreatorImpl();
        IProduct product = creator.createProduct();
        Assert.assertEquals("这不是产品B", "I am b product", product.getName());
    }
}