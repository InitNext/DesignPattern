package com.cyl.hello.designpattern.decorator;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        super();
        this.component = component;
    }

    public void method() {
        component.method();
    }
}
