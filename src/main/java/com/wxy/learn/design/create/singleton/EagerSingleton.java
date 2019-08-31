package com.wxy.learn.design.create.singleton;

/**
 * 饿汉式单例
 * 在这个类被加载时，静态变量instance会被初始化，此时类的私有构造子会被调用。这时候，单例类的唯一实例就被创建出来了。
 *
 * 在装载类的时候就创建对象实例。
 *
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    /**
     * 私有默认构造
     */
    private EagerSingleton(){}
    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance(){
        return instance;
    }
}
