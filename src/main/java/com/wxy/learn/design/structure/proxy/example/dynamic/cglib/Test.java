package com.wxy.learn.design.structure.proxy.example.dynamic.cglib;

import com.wxy.learn.design.structure.proxy.example.Hello;
import com.wxy.learn.design.structure.proxy.example.HelloImpl;

public class Test {

    public static void main(String[] args) {
        Hello  hello = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        hello.sayHello("Cglib");
    }
}
