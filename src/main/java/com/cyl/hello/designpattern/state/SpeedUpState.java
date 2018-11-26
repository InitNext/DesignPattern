package com.cyl.hello.designpattern.state;

public class SpeedUpState implements RunState{

    public void run(HeroV2 hero) {
        System.out.println("--------------加速跑动---------------");
        try {
            Thread.sleep(4000);//假设加速持续4秒
        } catch (InterruptedException e) {}
        hero.setState(HeroV2.COMMON);
        System.out.println("------加速状态结束，变为正常状态------");
    }

}
