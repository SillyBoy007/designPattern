package com.wxy.learn.design.action.command.demo.invoker;

import com.wxy.learn.design.action.command.demo.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
