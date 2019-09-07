package com.wxy.learn.design.create.singleton.test;

import java.util.Objects;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    private static LazySingleton getInstance(){
        if (Objects.isNull(lazySingleton)){
            return new LazySingleton();
        }
        return lazySingleton;
    }
}

