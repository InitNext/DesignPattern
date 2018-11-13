package com.cyl.hello.designpattern.strategy.demov3;

@TotalValidRegion(min=2000,max=3000)
public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }
}
