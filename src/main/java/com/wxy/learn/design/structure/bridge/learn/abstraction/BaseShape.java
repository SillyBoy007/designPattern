package com.wxy.learn.design.structure.bridge.learn.abstraction;

import com.wxy.learn.design.structure.bridge.learn.implementor.DrawAPI;

/**
 * 抽象化(Abstraction)角色:抽象化给出的定义，并保存一个对实现化对象的引用。
 */
public abstract class BaseShape {
    protected DrawAPI drawAPI;
    protected BaseShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
