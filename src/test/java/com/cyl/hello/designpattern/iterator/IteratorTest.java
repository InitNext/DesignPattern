package com.cyl.hello.designpattern.iterator;

import org.junit.Test;

import java.util.Iterator;


public class IteratorTest {

    @Test
    public void v1() {
        ArrayListV1<Integer> arrayList = new ArrayListV1<Integer>();
        for (int i = 1; i <= 11; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList size:" + arrayList.size());
        Object[] arrayListArray = arrayList.toArray();
        for (int i = 0; i < arrayListArray.length; i++) {
            System.out.println(arrayListArray[i]);
        }

        System.out.println("----------------------------------------------");

        HashSetV1<Integer> hashSet = new HashSetV1<Integer>();
        for (int i = 1; i <= 11; i++) {
            hashSet.add(i);
        }
        System.out.println("hashSet size:" + hashSet.size());
        Object[] setArray = hashSet.toArray();
        for (int i = 0; i < setArray.length; i++) {
            System.out.println(setArray[i]);
        }

        System.out.println("----------------------------------------------");

        LinkedListV1<Integer> linkedList = new LinkedListV1<Integer>();
        for (int i = 1; i <= 11; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList size:" + linkedList.size());
        Object[] linkedListArray = linkedList.toArray();
        for (int i = 0; i < linkedListArray.length; i++) {
            System.out.println(linkedListArray[i]);
        }
    }

    @Test
    public void v2() {
        ArrayListV2<Integer> arrayList = new ArrayListV2<Integer>();
        for (int i = 1; i <= 11; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList size:" + arrayList.size());
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while(arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("----------------------------------------------");

        HashSetV2<Integer> hashSet = new HashSetV2<Integer>();
        for (int i = 1; i <= 11; i++) {
            hashSet.add(i);
        }
        System.out.println("hashSet size:" + hashSet.size());
        Iterator<Integer> hashSetIterator = hashSet.iterator();
        while(hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        System.out.println("----------------------------------------------");

        LinkedListV2<Integer> linkedList = new LinkedListV2<Integer>();
        for (int i = 1; i <= 11; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList size:" + linkedList.size());
        Iterator<Integer> LinkedListIterator = linkedList.iterator();
        while(LinkedListIterator.hasNext()) {
            System.out.println(LinkedListIterator.next());
        }
    }

    @Test
    public void v2Variant() {
        ArrayListV2<Integer> arrayList = new ArrayListV2<Integer>();
        for (int i = 1; i <= 11; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList size:" + arrayList.size());
        for (Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        HashSetV2<Integer> hashSet = new HashSetV2<Integer>();
        for (int i = 1; i <= 11; i++) {
            hashSet.add(i);
        }
        System.out.println("hashSet size:" + hashSet.size());
        for (Integer i : hashSet) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        LinkedListV2<Integer> linkedList = new LinkedListV2<Integer>();
        for (int i = 1; i <= 11; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList size:" + linkedList.size());
        for (Integer i : linkedList) {
            System.out.println(i);
        }
    }
}