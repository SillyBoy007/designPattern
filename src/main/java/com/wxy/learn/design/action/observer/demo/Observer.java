package com.wxy.learn.design.action.observer.demo;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
