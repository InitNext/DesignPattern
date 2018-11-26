package com.cyl.hello.designpattern.chainofresponsibility;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChainOfResponsibilityTest {

    @Test
    public void v1() {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        McSubbranchV1 mcSubbranch1 = new McSubbranchV1(0, 0, new HashMap<String, Integer>(menu));
        McSubbranchV1 mcSubbranch2 = new McSubbranchV1(100, 120, new HashMap<String, Integer>(menu));
        McSubbranchV1 mcSubbranch3 = new McSubbranchV1(-100, -120, new HashMap<String, Integer>(menu));
        McSubbranchV1 mcSubbranch4 = new McSubbranchV1(1000, 20, new HashMap<String, Integer>(menu));
        McSubbranchV1 mcSubbranch5 = new McSubbranchV1(-500, 0, new HashMap<String, Integer>(menu));

        List<McSubbranchV1> mcSubbranchs = Arrays.asList(mcSubbranch1,mcSubbranch2,mcSubbranch3,mcSubbranch4,mcSubbranch5);

        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        printV1(mcSubbranchs);
        System.out.println("------------------------------------------");
        //小左开始一家一家挨着尝试订餐，直到成功
        for (McSubbranchV1 mcSubbranch : mcSubbranchs) {
            if (mcSubbranch.order(900, 20, order)) {
                System.out.println("订餐成功，接受订单的分店是：" + mcSubbranch);
                break;
            }
        }
        System.out.println("------------------------------------------");
        printV1(mcSubbranchs);
    }

    @Test
    public void v2() {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        Subbranch mcSubbranch1 = new McSubbranch(0, 0, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch2 = new McSubbranch(100, 120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch3 = new McSubbranch(-100, -120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch4 = new McSubbranch(1000, 20, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch5 = new McSubbranch(-500, 0, new HashMap<String, Integer>(menu));

        //以下设置职责链
        mcSubbranch4.setSuccessor(mcSubbranch5);
        mcSubbranch3.setSuccessor(mcSubbranch4);
        mcSubbranch2.setSuccessor(mcSubbranch3);
        mcSubbranch1.setSuccessor(mcSubbranch2);
        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        printV2(mcSubbranch1);
        System.out.println("------------------------------------------");

        //小左开始订餐，直接找mcSubbranch1的这一家分店订餐即可
        mcSubbranch1.handleOrder(new Order(900, 20, order));

        System.out.println("------------------------------------------");
        printV2(mcSubbranch1);
    }

    @Test
    public void v3() {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        Subbranch mcSubbranch1 = new McSubbranch(0, 0, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch2 = new McSubbranch(100, 120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch3 = new McSubbranch(-100, -120, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch4 = new McSubbranch(1000, 20, new HashMap<String, Integer>(menu));
        Subbranch mcSubbranch5 = new McSubbranch(-500, 0, new HashMap<String, Integer>(menu));

        //注册5个分店
        OrderManager.getOrderManager().registerSubbranch(mcSubbranch1,mcSubbranch2,mcSubbranch3,mcSubbranch4,mcSubbranch5);

        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        printV2(mcSubbranch1);
        System.out.println("------------------------------------------");

        //小左开始订餐，直接找订餐管理部门订餐
        OrderManager.getOrderManager().handleOrder(new Order(900, 20, order));

        System.out.println("------------------------------------------");
        printV2(mcSubbranch1);
    }

    public static void printV1(List<McSubbranchV1> mcSubbranchs){
        for (McSubbranchV1 mcSubbranch : mcSubbranchs) {
            System.out.println("[" + mcSubbranch + "]的菜单:" + mcSubbranch.getMenu());
        }
    }

    public static void printV2(Subbranch subbranch){
        if (subbranch == null ) {
            return;
        }
        do {
            if (subbranch instanceof McSubbranch) {
                System.out.println("[" + subbranch + "]的菜单:" + ((McSubbranch) subbranch).getMenu());
            }
        } while ((subbranch = ((McSubbranch) subbranch).getNextSubbranch()) != null);
    }
}