package com.wxy.learn.design.structure.bridge.learn;

import com.wxy.learn.design.structure.bridge.learn.abstraction.BaseShape;
import com.wxy.learn.design.structure.bridge.learn.concreteimplementor.GreenCircle;
import com.wxy.learn.design.structure.bridge.learn.concreteimplementor.RedCircle;
import com.wxy.learn.design.structure.bridge.learn.refinedabstraction.Circle;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        BaseShape redCircle = new Circle(100,100, 10, new RedCircle());
        BaseShape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
