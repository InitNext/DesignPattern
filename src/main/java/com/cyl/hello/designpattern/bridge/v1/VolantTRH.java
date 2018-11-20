package com.cyl.hello.designpattern.bridge.v1;

//带有飞行技能的屌丝分身
public class VolantTRH extends TRH {

    public VolantTRH(){
        System.out.println("制造一个带飞行技能的高富帅分身");
    }

    public void releaseSkills(){
        System.out.println("高富帅分身释放飞行技能");
    }
}
