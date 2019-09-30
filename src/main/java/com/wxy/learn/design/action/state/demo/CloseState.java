package com.wxy.learn.design.action.state.demo;

public class CloseState implements State {

    @Override
    public void start(Context context) {
        //注意状态的切换
        context.setState(new StartState());
        System.out.println("start State");
    }
    @Override
    public void close(Context context) {
    }
}