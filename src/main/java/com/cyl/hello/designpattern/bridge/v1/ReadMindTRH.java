package com.cyl.hello.designpattern.bridge.v1;

//带有读心术技能的屌丝分身
public class ReadMindTRH extends TRH {

    public ReadMindTRH(){
        System.out.println("制造一个带读心术技能的高富帅分身");
    }

    public void releaseSkills(){
        System.out.println("高富帅分身释放读心术技能");
    }
}
