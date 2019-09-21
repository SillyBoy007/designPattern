package com.wxy.learn.design.structure.proxy.example.statlc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuyCarProxy implements IBuyCar {
    //接收买车客户
    private Customer customer;

    public BuyCarProxy(Customer customer){
        //接收买车客户
        this.customer=customer;
    }

    @Override
    public void buyCar() {
        //实现为客户买车
        int cash=customer.getCash();
        if(cash<100000){
            log.info("buyCar:{}","你的钱不够买一辆车");
            return;
        }
        customer.buyCar();
    }
}
