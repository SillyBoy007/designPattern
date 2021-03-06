package com.wxy.learn.design.action.observer.push;

/**
 * 观察者模式客户端类
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
