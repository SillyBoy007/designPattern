package com.wxy.learn.design.structure.decorator.demo.concreteDecorator;

import com.wxy.learn.design.structure.decorator.demo.component.TheGreatestSage;
import com.wxy.learn.design.structure.decorator.demo.decorator.Change;

public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }

}
