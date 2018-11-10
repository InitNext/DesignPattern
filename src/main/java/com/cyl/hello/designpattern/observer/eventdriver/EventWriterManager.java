package com.cyl.hello.designpattern.observer.eventdriver;

import com.cyl.hello.designpattern.observer.Writer;

import java.util.HashMap;
import java.util.Map;

//管理器，保持一份独有的作者列表
public class EventWriterManager {

    private Map<String, EventWriter> writerMap = new HashMap<String, EventWriter>();

    //添加作者
    public void add(EventWriter writer){
        writerMap.put(writer.getName(), writer);
    }
    //根据作者姓名获取作者
    public EventWriter getWriter(String name){
        return writerMap.get(name);
    }

    //单例
    private EventWriterManager(){}

    public static EventWriterManager getInstance(){
        return EventWriterManagerInstance.instance;
    }
    private static class EventWriterManagerInstance{

        private static EventWriterManager instance = new EventWriterManager();

    }
}
