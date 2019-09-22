package com.wxy.learn.design.action.command.demo.client;

import com.wxy.learn.design.action.command.demo.invoker.Broker;
import com.wxy.learn.design.action.command.demo.concretecommand.BuyStock;
import com.wxy.learn.design.action.command.demo.concretecommand.SellStock;
import com.wxy.learn.design.action.command.demo.receiver.Stock;

/**
 * 客户端(Client)角色：创建一个具体命令(ConcreteCommand)对象并确定其接收者。
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
