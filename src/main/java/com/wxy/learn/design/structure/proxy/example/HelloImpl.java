package com.wxy.learn.design.structure.proxy.example;

public class HelloImpl implements Hello {
    @Override
    public void sayHello(String str) {
        System.out.println(String.format("Hello,World%s",str));
    }
}
