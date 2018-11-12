package com.cyl.hello.designpattern.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrainStationProxyTest {

    @Test
    public void sell() {
        SomeBody someBody=new SomeBody();
        TrainStationProxy adaptor=new TrainStationProxy(new TrainStation());
        someBody.goToTicketSubject(adaptor);
        someBody.buy();
    }
}