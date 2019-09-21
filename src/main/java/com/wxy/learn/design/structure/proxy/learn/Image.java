package com.wxy.learn.design.structure.proxy.learn;

/**
 * 抽象对象角色：声明了目标对象和代理对象的共同接口，这样一来在任何可以使用目标对象的地方都可以使用代理对象。
 */
public interface Image {
    void display();
}
