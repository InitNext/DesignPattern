package com.cyl.hello.designpattern.observer.eventdriver;

public class EventReader implements WriterListener{

    private String name;

    public EventReader(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的监听器列表里
    public void subscribe(String writerName){
        EventWriterManager.getInstance().getWriter(writerName).registerListener(this);
    }

    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的监听器列表里注销
    public void unsubscribe(String writerName){
        EventWriterManager.getInstance().getWriter(writerName).unregisterListener(this);
    }

    public void addNovel(WriterEvent writerEvent) {
        EventWriter eventWriter = writerEvent.getWriter();
        System.out.println(name+"知道" + eventWriter.getName() + "发布了新书《" + eventWriter.getLastNovel() + "》，非要去看！");
    }

}
