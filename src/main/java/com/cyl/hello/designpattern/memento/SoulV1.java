package com.cyl.hello.designpattern.memento;

public class SoulV1 {

    private Memory memory;

    //抽离或者说搜集一个人的记忆
    public void pullAwayMemory(PersonV2 person){
        memory = person.getMemory();
    }

    //强行将一个人的记忆固定在某一刻
    public void forceFixMemory(PersonV2 person){
        person.setMemory(memory);
    }
}
