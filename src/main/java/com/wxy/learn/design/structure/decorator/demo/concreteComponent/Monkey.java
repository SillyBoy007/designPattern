package com.wxy.learn.design.structure.decorator.demo.concreteComponent;

import com.wxy.learn.design.structure.decorator.demo.component.TheGreatestSage;

/**
 * 具体构件角色“大圣本尊”猢狲类
 */
public class Monkey implements TheGreatestSage {
    @Override
    public void move() {
        //代码
        System.out.println("Monkey Move");
    }

}
