package com.cyl.hello.designpattern.flyweight;

public class SFV1 extends AbstractHeroV1 {
    public String getName() {
        return "影魔";
    }

    public void initSkills() {
        skills[0] = "毁灭阴影";
        skills[1] = "支配死灵";
        skills[2] = "魔王降临";
        skills[3] = "魂之挽歌";
    }
}
