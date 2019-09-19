package com.wxy.learn.design.structure.decorator.demo;

import com.wxy.learn.design.structure.decorator.demo.component.TheGreatestSage;
import com.wxy.learn.design.structure.decorator.demo.concreteComponent.Monkey;
import com.wxy.learn.design.structure.decorator.demo.concreteDecorator.Bird;
import com.wxy.learn.design.structure.decorator.demo.concreteDecorator.Fish;

public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        //TheGreatestSage fish = new Fish(bird);
        // 第二种写法
      //  TheGreatestSage fish = new Fish(new Bird(sage));
        TheGreatestSage fish = new Fish(sage);

        fish.move();

        bird.move();

        sage.move();
    }

}
