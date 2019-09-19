package com.wxy.learn.design.structure.decorator.demo.decorator;

import com.wxy.learn.design.structure.decorator.demo.component.TheGreatestSage;

/**
 * 抽象装饰角色“七十二变”
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        // 代码
        sage.move();
    }
}
