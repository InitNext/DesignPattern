package com.cyl.hello.designpattern.observer.eventdriver;

import com.cyl.hello.designpattern.observer.Writer;

import java.util.EventObject;

//事件
public class WriterEvent extends EventObject{

    private static final long serialVersionUID = 8546459078247503692L;

    public WriterEvent(EventWriter writer) {
        super(writer);
    }

    public EventWriter getWriter(){
        return (EventWriter) super.getSource();
    }

}
