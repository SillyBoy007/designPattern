package com.wxy.learn.design.structure.flyweight.demo;

/**
 * 单纯享元模式 : 　在单纯的享元模式中，所有的享元对象都是可以共享的。
 * 抽象享元角色类
 */
public interface Flyweight {
    //一个示意性方法，参数state是外蕴状态
    public void operation(String state);
}
