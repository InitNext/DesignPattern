package com.cyl.hello.designpattern.bridge;

public class Invisible implements Skills {
    @Override
    public void releaseSkills() {
        System.out.println("释放隐身技能");
    }
}
