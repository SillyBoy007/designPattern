package com.wxy.learn.design.action.observer.watched;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {

        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        Observer watcher2 = new Watcher2(watched);

        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }
}
