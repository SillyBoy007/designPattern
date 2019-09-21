package com.wxy.learn.design.structure.proxy.example.dynamic.jdk;

import com.wxy.learn.design.structure.proxy.example.Hello;
import com.wxy.learn.design.structure.proxy.example.HelloImpl;

public class Test {
    public static void main(String[] args) {
        Hello hello = new JDKDynamicProxy(new HelloImpl()).getProxy();
        hello.sayHello("JDK");
    }
}
