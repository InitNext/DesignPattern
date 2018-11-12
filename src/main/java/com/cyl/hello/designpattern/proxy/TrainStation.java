package com.cyl.hello.designpattern.proxy;

public class TrainStation implements TicketSubject {
    @Override
    public void sell() {
        System.out.println("卖出一张票!");
    }
}
