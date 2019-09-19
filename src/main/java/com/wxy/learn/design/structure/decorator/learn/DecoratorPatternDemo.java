package com.wxy.learn.design.structure.decorator.learn;

import com.wxy.learn.design.structure.decorator.learn.component.Shape;
import com.wxy.learn.design.structure.decorator.learn.concreteComponent.Circle;
import com.wxy.learn.design.structure.decorator.learn.concreteComponent.Rectangle;
import com.wxy.learn.design.structure.decorator.learn.concreteDecorator.RedShapeDecorator;
import com.wxy.learn.design.structure.decorator.learn.decorator.ShapeDecorator;

/**
 * 客户端类
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
