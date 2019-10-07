package com.wxy.learn.design.action.visitor.demo;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}