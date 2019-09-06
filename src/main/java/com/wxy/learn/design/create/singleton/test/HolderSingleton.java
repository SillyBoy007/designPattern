package com.wxy.learn.design.create.singleton.test;

public class HolderSingleton {
    private HolderSingleton(){}
    public static class Singleton {
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getInstance(){
        return Singleton.singleton;
    }
}
