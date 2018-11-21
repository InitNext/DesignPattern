package com.cyl.hello.designpattern.iterator;

public class ArrayListV1<E> {

    private static final int INCREMENT = 10;

    private E[] array = (E[]) new Object[10];

    private int size;

    public void add(E e){
        if (size < array.length) {
            array[size++] = e;
        }else {
            E[] copy = (E[]) new Object[array.length + INCREMENT];
            System.arraycopy(array, 0, copy, 0, size);
            copy[size++] = e;
            array = copy;
        }
    }

    public Object[] toArray(){
        Object[] copy = new Object[size];
        System.arraycopy(array, 0, copy, 0, size);
        return copy;
    }

    public int size(){
        return size;
    }
}
