package com.wxy.learn.design.action.command.demo.concretecommand;

import com.wxy.learn.design.action.command.demo.command.Order;
import com.wxy.learn.design.action.command.demo.receiver.Stock;

public class SellStock  implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
