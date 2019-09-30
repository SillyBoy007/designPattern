package com.wxy.learn.design.structure.proxy.demo;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated methodfactory stub
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
