package com.cyl.hello.designpattern.state;

public class SwimState implements RunState {
    public void run(HeroV2 hero) {
        System.out.println("--------------不能跑动---------------");
        try {
            Thread.sleep(2000);//假设眩晕持续2秒
        } catch (InterruptedException e) {}
        hero.setState(HeroV2.COMMON);
        System.out.println("------眩晕状态结束，变为正常状态------");
    }
}
