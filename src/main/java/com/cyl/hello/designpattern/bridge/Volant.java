package com.cyl.hello.designpattern.bridge;

public class Volant implements Skills {
    @Override
    public void releaseSkills() {
        System.out.println("释放飞行技能");
    }
}
