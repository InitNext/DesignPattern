package com.cyl.hello.designpattern.bridge;

public class ReadMind implements Skills {
    @Override
    public void releaseSkills() {
        System.out.println("释放读心术技能");
    }
}
