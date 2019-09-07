package com.wxy.learn.design.structure.bridge.learn.refinedabstraction;

import com.wxy.learn.design.structure.bridge.learn.implementor.DrawAPI;
import com.wxy.learn.design.structure.bridge.learn.abstraction.BaseShape;

/**
 * 修正抽象化(RefinedAbstraction)角色:扩展抽象化角色，改变和修正父类对抽象化的定义。
 */
public class Circle extends BaseShape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
