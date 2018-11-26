package com.cyl.hello.designpattern.state;

import org.junit.Test;

public class StateTest {

    @Test
    public void v1() throws Exception {
        HeroV1 hero = new HeroV1();
        hero.startRun();
        hero.setState(HeroV1.SPEED_UP);
        Thread.sleep(5000);
        hero.setState(HeroV1.SPEED_DOWN);
        Thread.sleep(5000);
        hero.setState(HeroV1.SWIM);
        Thread.sleep(5000);
        hero.stopRun();
    }

}