package com.cyl.hello.designpattern.strategy.demov3;

@TotalValidRegion(max=1000)//设置普通的在0-1000生效，以下类似，不再注释
public class Common implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }
}
