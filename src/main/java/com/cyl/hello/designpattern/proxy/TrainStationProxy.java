package com.cyl.hello.designpattern.proxy;

public class TrainStationProxy implements TicketSubject {

    private TrainStation trainStation;//持有真实对象的引用
    public TrainStationProxy(TrainStation trainStation){
        this.trainStation=trainStation;
    }

    public void sell() {
        System.out.println("欢迎光临!");
        trainStation.sell();//调用真实对象的方法，体现代理行为
        System.out.println("请交手续费!");
    }
}
