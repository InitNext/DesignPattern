package com.cyl.hello.designpattern.strategy.demov4;

@TotalValidRegion(@ValidRegion(min=1000,max=2000,order=99))
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }
}
