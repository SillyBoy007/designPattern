package com.wxy.learn.design.action.command.demo.concretecommand;

import com.wxy.learn.design.action.command.demo.command.Order;
import com.wxy.learn.design.action.command.demo.receiver.Stock;

/**
 * 具体命令(ConcreteCommand)角色：定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
