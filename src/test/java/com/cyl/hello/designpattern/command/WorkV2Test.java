package com.cyl.hello.designpattern.command;

import com.cyl.hello.designpattern.command.v2.Programmer;
import com.cyl.hello.designpattern.command.v2.Salesman;
import com.cyl.hello.designpattern.command.v2.ProductManager;
import org.junit.Test;

public class WorkV2Test {

    @Test
    public void work() {
        Programmer xiaozuo = new Programmer("小左");
        ProductManager productManager = new ProductManager();

        Salesman salesmanA = new Salesman("A");
        Salesman salesmanB = new Salesman("B");
        Salesman salesmanC = new Salesman("C");
        Salesman salesmanD = new Salesman("D");

        salesmanA.putDemand(productManager, xiaozuo);
        salesmanB.putDemand(productManager, xiaozuo);
        salesmanB.putBug(productManager, xiaozuo);
        salesmanC.putDemand(productManager, xiaozuo);
        salesmanC.putProblem(productManager, xiaozuo);
        salesmanD.putDemand(productManager, xiaozuo);

        System.out.println("第一天产品经理分配任务");
        productManager.assign();
        productManager.printTaskList();
        System.out.println("第二天产品经理分配任务");
        productManager.assign();
        productManager.printTaskList();
    }
}