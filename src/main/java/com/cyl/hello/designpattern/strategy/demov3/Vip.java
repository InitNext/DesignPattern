package com.cyl.hello.designpattern.strategy.demov3;

@TotalValidRegion(min=1000,max=2000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }
}
