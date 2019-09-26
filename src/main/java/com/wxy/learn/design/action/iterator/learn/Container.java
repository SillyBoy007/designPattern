package com.wxy.learn.design.action.iterator.learn;

/**
 * 聚集(Aggregate)角色：此抽象角色给出创建迭代子(Iterator)对象的接口。
 */
public interface Container {
    public Iterator getIterator();
}
