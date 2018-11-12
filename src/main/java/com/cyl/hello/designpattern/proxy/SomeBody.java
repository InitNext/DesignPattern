package com.cyl.hello.designpattern.proxy;

public class SomeBody {

    private TicketSubject tickSubject;
    public void buy(){
        tickSubject.sell();
    }
    public void goToTicketSubject( TicketSubject tickSubject){
        this.tickSubject=tickSubject;
    }
}
