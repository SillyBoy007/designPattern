package com.wxy.learn.design.structure.bridge.learn.concreteimplementor;

import com.wxy.learn.design.structure.bridge.learn.implementor.DrawAPI;

/**
 * 桥接实现类
 * 具体实现化(ConcreteImplementor)角色：这个角色给出实现化角色接口的具体实现。
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
