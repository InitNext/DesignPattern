package com.cyl.hello.designpattern.strategy.demov4;

@TotalValidRegion(@ValidRegion(min=3000,order=99))
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }
}
