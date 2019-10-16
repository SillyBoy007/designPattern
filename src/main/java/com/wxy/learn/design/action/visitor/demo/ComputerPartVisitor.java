package com.wxy.learn.design.action.visitor.demo;

/**
 *  抽象访问者(Visitor)角色：声明了一个或者多个方法操作，形成所有的具体访问者角色必须实现的接口。
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
