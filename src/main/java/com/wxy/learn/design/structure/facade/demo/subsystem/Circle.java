package com.wxy.learn.design.structure.facade.demo.subsystem;


public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle:draw()");
    }
}
