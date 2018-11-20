package com.cyl.hello.designpattern.memento;

import java.util.HashMap;
import java.util.Map;

public class SoulV2 {

    private Map<PersonV2, Memory> memoryMap = new HashMap<PersonV2, Memory>();

    //抽离或者说搜集一个人的记忆
    public void pullAwayMemory(PersonV2 person){
        memoryMap.put(person, person.getMemory());
    }

    //强行将一个人的记忆固定在某一刻
    public void forceFixMemory(PersonV2 person){
        if (memoryMap.containsKey(person)) {
            person.setMemory(memoryMap.get(person));
        }
    }
}
