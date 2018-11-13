package com.cyl.hello.designpattern.strategy.demov3;

@TotalValidRegion(min=3000)
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }
}
