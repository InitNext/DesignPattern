package com.cyl.hello.designpattern.strategy.demov2;

public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }
}
