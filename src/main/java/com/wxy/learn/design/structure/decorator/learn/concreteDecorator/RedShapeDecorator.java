package com.wxy.learn.design.structure.decorator.learn.concreteDecorator;

import com.wxy.learn.design.structure.decorator.learn.component.Shape;
import com.wxy.learn.design.structure.decorator.learn.decorator.ShapeDecorator;

/**
 * 具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
