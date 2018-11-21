package com.cyl.hello.designpattern.iterator;

public class LinkedListV1<E> {

    private Entry<E> header = new Entry<E>(null, null, null);
    private int size;

    public LinkedListV1() {
        header.next = header.previous = header;
    }

    public void add(E e){
        Entry<E> newEntry = new Entry<E>(e, header, header.next);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
    }

    public int size(){
        return size;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        int i = size - 1;
        for (Entry<E> e = header.next; e != header; e = e.next)
            result[i--] = e.value;
        return result;
    }

    private static class Entry<E>{
        E value;
        Entry<E> previous;
        Entry<E> next;
        public Entry(E value, Entry<E> previous, Entry<E> next) {
            super();
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
