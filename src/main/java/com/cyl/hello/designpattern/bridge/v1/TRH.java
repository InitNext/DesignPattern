package com.cyl.hello.designpattern.bridge.v1;

//高富帅
public class TRH extends Soul {

    public TRH(){
        System.out.println("制造一个无技能的高富帅分身");
    }

    public void doAllLikePeople(){
        System.out.println("分身可以像正常人一样做任何事");
    }

    public void show(){
        System.out.println("展示高富帅形象");
    }
}
