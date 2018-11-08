package com.cyl.hello.designpattern.Prototype;

public class ShallowPrototype implements Cloneable {
    private int x;
    private int y;
    private int z;
    private FieldV1 fieldV1;

    public ShallowPrototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.fieldV1 = new FieldV1();
        this.fieldV1.setA(5);
    }

    public FieldV1 getFieldV1() {
        return fieldV1;
    }

    @Override
    public ShallowPrototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (ShallowPrototype) object;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "," + fieldV1.getA() + "]";
    }

    public static void main(String[] args) {
        ShallowPrototype prototype1 = new ShallowPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getFieldV1());
        ShallowPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype2.getFieldV1());
    }
}
