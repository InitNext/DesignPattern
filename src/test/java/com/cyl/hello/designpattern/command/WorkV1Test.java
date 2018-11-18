package com.cyl.hello.designpattern.command;

import com.cyl.hello.designpattern.command.v1.Programmer;
import com.cyl.hello.designpattern.command.v1.Salesman;
import com.cyl.hello.designpattern.command.v2.ProductManager;
import org.junit.Test;

public class WorkV1Test {

    @Test
    public void work() {
        Programmer xiaozuo = new Programmer("小左");

        Salesman salesmanA = new Salesman("A");
        salesmanA.putDemand(xiaozuo);

        Salesman salesmanB = new Salesman("B");
        salesmanB.putDemand(xiaozuo);

        Salesman salesmanC = new Salesman("C");
        salesmanC.putBug(xiaozuo);

        Salesman salesmanD = new Salesman("D");
        salesmanD.putProblem(xiaozuo);
    }
}