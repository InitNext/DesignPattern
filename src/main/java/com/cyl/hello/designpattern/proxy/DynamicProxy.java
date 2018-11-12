package com.cyl.hello.designpattern.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void main(String[] args) {
        RealSubjectA realA = new RealSubjectA();
        SubjectA proxySubjectA = (SubjectA) Proxy.newProxyInstance(SubjectA.class.getClassLoader(),
                new Class[]{SubjectA.class},
                new LogHandler(realA));//生成一个业务A的动态代理对象
        RealSubjectB realB = new RealSubjectB();
        SubjectB proxySubjectB = (SubjectB) Proxy.newProxyInstance(SubjectB.class.getClassLoader(),
                new Class[]{SubjectB.class},
                new LogHandler(realB));//生成一个业务B的动态代理对象
        proxySubjectA.setUser("heaven","123456");
        proxySubjectB.sayHello("heaven");
    }
}
