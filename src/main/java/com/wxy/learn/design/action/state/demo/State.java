package com.wxy.learn.design.action.state.demo;

public interface State {
    public void start(Context context);
    public void close(Context context);
}