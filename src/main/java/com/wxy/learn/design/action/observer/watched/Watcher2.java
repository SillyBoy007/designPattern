package com.wxy.learn.design.action.observer.watched;

import java.util.Observable;
import java.util.Observer;

public class Watcher2 implements Observer {
    public Watcher2(Observable o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态2发生改变：" + ((Watched)o).getData());
    }
}
