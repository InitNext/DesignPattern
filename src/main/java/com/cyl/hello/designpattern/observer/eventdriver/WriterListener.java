package com.cyl.hello.designpattern.observer.eventdriver;

import java.util.EventListener;

//事件监听器
public interface WriterListener extends EventListener{

    void addNovel(WriterEvent writerEvent);

}
