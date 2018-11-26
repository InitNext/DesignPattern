package com.cyl.hello.designpattern.chainofresponsibility;

public interface Subbranch {

    void setSuccessor(Subbranch subbranch);

    boolean handleOrder(Order order);

}
