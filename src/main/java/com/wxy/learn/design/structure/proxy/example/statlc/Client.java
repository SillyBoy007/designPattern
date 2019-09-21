package com.wxy.learn.design.structure.proxy.example.statlc;

/**
 * 静态代理模式
 */
public class Client {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setCash(20000);
        BuyCarProxy buyCarProxy=new BuyCarProxy(customer);
        buyCarProxy.buyCar();
    }
}
