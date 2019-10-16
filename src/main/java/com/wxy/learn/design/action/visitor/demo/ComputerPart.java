package com.wxy.learn.design.action.visitor.demo;

/**
 * 抽象节点(Node)角色：声明一个接受操作，接受一个访问者对象作为一个参数。
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}