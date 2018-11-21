package com.cyl.hello.designpattern.iterator;

import java.util.HashMap;
import java.util.Map;

public class HashSetV1<E> {

    private static final Object NULL = new Object();

    private Map<E, Object> map = new HashMap<E, Object>();

    public void add(E e){
        map.put(e, NULL);
    }

    public int size(){
        return map.size();
    }

    public Object[] toArray(){
        return map.keySet().toArray();
    }
}
