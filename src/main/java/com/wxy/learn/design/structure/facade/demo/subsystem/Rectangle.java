package com.wxy.learn.design.structure.facade.demo.subsystem;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle:draw()");
    }
}
