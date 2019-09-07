package com.wxy.learn.design.create.singleton.test;

import java.util.Objects;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton  doubleCheckSingleton = null;
    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getIncetance() {
        if (Objects.isNull(doubleCheckSingleton)){
            synchronized (DoubleCheckSingleton.class){
                if (Objects.isNull(doubleCheckSingleton)){
                     doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
