package com.cyl.hello.designpattern.visitor.v1;

//单个单子的接口（相当于Element）
public interface Bill {

    void accept(AccountBookViewer viewer);

}
