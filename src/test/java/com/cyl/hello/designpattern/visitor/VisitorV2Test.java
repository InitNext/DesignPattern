package com.cyl.hello.designpattern.visitor;

import com.cyl.hello.designpattern.visitor.v2.*;
import org.junit.Test;

public class VisitorV2Test {

    @Test
    public void v2() {
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(2000, "材料费"));

        Viewer boss = new Boss();
        Viewer cpa = new CPA();
        Viewer cfo = new CFO();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);
        accountBook.show(cfo);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();
    }
}
