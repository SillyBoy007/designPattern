package com.wxy.learn.design.action.observer.pull;

public class TwoObserver implements Observer {
    //观察者的状态
    private String observerState;
    @Override
    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("观察者2状态为："+observerState);
    }
}
