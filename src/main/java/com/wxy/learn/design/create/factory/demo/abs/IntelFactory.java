package com.wxy.learn.design.create.factory.demo.abs;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.component.impl.IntelCpu;
import com.wxy.learn.design.create.factory.component.impl.IntelMainboard;

public class IntelFactory  implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(222);
    }

    @Override
    public Mainboard createMainBoard() {
        return new IntelMainboard(222);
    }
}
