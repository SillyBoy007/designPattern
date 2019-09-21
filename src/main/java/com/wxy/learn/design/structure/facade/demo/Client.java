package com.wxy.learn.design.structure.facade.demo;

import com.wxy.learn.design.structure.facade.demo.facade.ShapeMaker;

public class Client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
