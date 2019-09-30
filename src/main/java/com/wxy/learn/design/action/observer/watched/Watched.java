package com.wxy.learn.design.action.observer.watched;

import java.util.Observable;

/**
 * 被观察者类
 */
public class Watched extends Observable {
    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
