package com.cyl.hello.designpattern.strategy.demov1;

public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }
}
