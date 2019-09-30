package com.wxy.learn.design.action.state.demo;

public class Context {
    private State state;
    public Context setState(State state) {
        this.state = state;
        return this;
    }

    public State getState() {
        return state;
    }

    public void start() {
        getState().start(this);
    }

    public void close() {
        getState().close(this);
    }
}