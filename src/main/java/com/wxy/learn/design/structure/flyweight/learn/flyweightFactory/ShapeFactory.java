package com.wxy.learn.design.structure.flyweight.learn.flyweightFactory;

import com.wxy.learn.design.structure.flyweight.learn.concreteFlyweight.Circle;
import com.wxy.learn.design.structure.flyweight.learn.flyweight.Shape;

import java.util.HashMap;

/**
 * 享元工厂(FlyweightFactory)角色
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
