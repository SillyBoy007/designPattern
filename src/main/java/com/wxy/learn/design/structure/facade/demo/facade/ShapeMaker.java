package com.wxy.learn.design.structure.facade.demo.facade;

import com.wxy.learn.design.structure.facade.demo.subsystem.Circle;
import com.wxy.learn.design.structure.facade.demo.subsystem.Rectangle;
import com.wxy.learn.design.structure.facade.demo.subsystem.Shape;
import com.wxy.learn.design.structure.facade.demo.subsystem.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
