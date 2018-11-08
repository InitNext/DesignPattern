package com.cyl.hello.designpattern.Prototype;

public class FieldV2 implements Cloneable {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    protected FieldV2 clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (FieldV2) object;
    }
}
