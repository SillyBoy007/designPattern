package com.wxy.learn.design.action.visitor.demo;

/**
 *  具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
