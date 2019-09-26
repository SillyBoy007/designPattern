package com.wxy.learn.design.action.iterator.learn;

/**
 * 　抽象迭代子(Iterator)角色：此抽象角色定义出遍历元素所需的接口。
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
