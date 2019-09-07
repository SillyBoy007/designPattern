package com.wxy.learn.design.create.singleton.test;

public class EagerSingleton {
    private static EagerSingleton  eagerSingleton = new EagerSingleton();

    private EagerSingleton(){}

    private static EagerSingleton getIncetance(){
        return new EagerSingleton();
    }
}

