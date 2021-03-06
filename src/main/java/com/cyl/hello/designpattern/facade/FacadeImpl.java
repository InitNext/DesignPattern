package com.cyl.hello.designpattern.facade;

public class FacadeImpl implements Facade {

    private Sub1 sub1;

    private Sub2 sub2;

    private Sub3 sub3;

    public FacadeImpl() {
        super();
        this.sub1 = new Sub1Impl();
        this.sub2 = new Sub2Impl();
        this.sub3 = new Sub3Impl();
    }

    public FacadeImpl(Sub1 sub1, Sub2 sub2, Sub3 sub3) {
        super();
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public void function12() {
        sub1.function1();
        sub2.function2();
    }

    public void function23() {
        sub2.function2();
        sub3.function3();
    }

    public void function123() {
        sub1.function1();
        sub2.function2();
        sub3.function3();
    }
}
