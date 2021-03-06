package com.cyl.hello.designpattern.visitor.v2;

//消费的单子
public class ConsumeBill extends AbstractBill {

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewConsumeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}
