package com.wxy.learn.design.structure.strategy.demo;


public class Context {
    private Strategy strategy;

    public Context(){

    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}