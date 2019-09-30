package com.wxy.learn.design.action.observer.pull;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        TwoObserver observer2 = new TwoObserver();

        subject.setState("heh");

        observer.update(subject);
        observer2.update(subject);
    }
}
