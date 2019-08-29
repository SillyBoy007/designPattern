package com.wxy.learn.design.create.factory.demo.simple;

import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.component.impl.AmdMainboard;
import com.wxy.learn.design.create.factory.component.impl.IntelMainboard;

public class MainBoardFactory {
    public Mainboard createMainBoard(int type){
        if (type == 1){
            return new AmdMainboard(111);
        }else {
            return new IntelMainboard(222);
        }

    }
}
