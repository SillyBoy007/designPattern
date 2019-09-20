package com.wxy.learn.design.structure.proxy.demo;

public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}
