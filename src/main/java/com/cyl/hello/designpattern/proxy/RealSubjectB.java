package com.cyl.hello.designpattern.proxy;

public class RealSubjectB implements SubjectB {
    @Override
    public void sayHello(String name) {
        System.out.println("--------------say hello:"+name+"-------------");
    }
}
