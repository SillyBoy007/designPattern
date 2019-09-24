package com.wxy.learn.design.action.interpreter.demo;

/**
 * 抽象表达式(Expression)角色：声明一个所有的具体表达式角色都需要实现的抽象接口。这个接口主要是一个interpret()方法，称做解释操作。
 */
public interface Expression {
    public boolean interpret(String context);
}
