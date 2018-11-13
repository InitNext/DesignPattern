package com.cyl.hello.designpattern.strategy.demov4;

@OnceValidRegion(@ValidRegion(min=1000,max=2000,order=40))
class OneTDTwoH implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice - 200;
    }

}
