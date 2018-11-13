package com.cyl.hello.designpattern.strategy.demov1;

public class Common implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }
}
