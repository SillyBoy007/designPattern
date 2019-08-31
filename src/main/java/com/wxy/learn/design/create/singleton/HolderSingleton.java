package com.wxy.learn.design.create.singleton;

/**
 * Lazy initialization holder class模式
 *
 */
public class HolderSingleton {
    private HolderSingleton(){}

    /**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class Singleton{
        /**
         * 静态初始化器，由JVM保证线程安全
         */

        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance (){
        return Singleton.instance;
    }
}
