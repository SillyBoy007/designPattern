package com.wxy.learn.design.structure.facade.demo.subsystem;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square:draw()");
    }
}
