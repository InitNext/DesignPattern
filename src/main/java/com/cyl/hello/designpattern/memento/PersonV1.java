package com.cyl.hello.designpattern.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonV1 {

    private String name;

    private List<String> storyList;//故事列表

    public PersonV1(String name){
        this.name = name;
        storyList = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //故事列表不能修改
    public List<String> getStoryList() {
        return Collections.unmodifiableList(storyList);
    }
    //可以添加，但不可以删除
    public void addStory(String history) {
        this.storyList.add(history);
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer(name + "的记忆：\n");
        for(String memory : storyList){
            stringBuffer.append(memory).append("\n");
        }
        return stringBuffer.toString();
    }
}
