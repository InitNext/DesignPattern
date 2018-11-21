package com.cyl.hello.designpattern.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSetV2<E> implements Iterable<E> {

    private static final Object NULL = new Object();

    private Map<E, Object> map = new HashMap<E, Object>(7,1);

    public void add(E e){
        map.put(e, NULL);
    }

    public int size(){
        return map.size();
    }

    public Object[] toArray(){
        return map.keySet().toArray();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
}
