package com.wxy.learn.design.structure.decorator.learn.concreteComponent;

import com.wxy.learn.design.structure.decorator.learn.component.Shape;

/**
 * 具体构件(ConcreteComponent)角色
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
