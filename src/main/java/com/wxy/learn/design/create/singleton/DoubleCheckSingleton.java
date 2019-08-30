package com.wxy.learn.design.create.singleton;

/**
 * 双重检查加锁
 * 既实现线程安全，又能够使性能不受很大的影响
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){}

    private static DoubleCheckSingleton getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class){
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
