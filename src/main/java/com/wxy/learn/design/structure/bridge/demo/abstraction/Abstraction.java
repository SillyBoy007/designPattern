package com.wxy.learn.design.structure.bridge.demo.abstraction;

import com.wxy.learn.design.structure.bridge.demo.implementor.Implementor;

/**
 * 　抽象化角色类
 */
public class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    //示例方法
    public void operation(){

        impl.operationImpl();
    }
}
