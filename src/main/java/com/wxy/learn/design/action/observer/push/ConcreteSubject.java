package com.wxy.learn.design.action.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题(ConcreteSubject)角色：将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记 的观察者发出通知。具体主题角色又叫做具体被观察者(Concrete Observable*
 */
public class ConcreteSubject extends Subject{

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

