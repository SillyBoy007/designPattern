package com.wxy.learn.design.structure.bridge.learn.implementor;

/**
 * 桥接实现接口
 * 实现化(Implementor)角色：这个角色给出实现化角色的接口，但不给出具体的实现。
 */
public interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}
