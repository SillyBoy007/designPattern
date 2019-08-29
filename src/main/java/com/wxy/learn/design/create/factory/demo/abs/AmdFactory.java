package com.wxy.learn.design.create.factory.demo.abs;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.component.impl.AmdCpu;
import com.wxy.learn.design.create.factory.component.impl.AmdMainboard;

public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu(111);
    }

    @Override
    public Mainboard createMainBoard() {
        return new AmdMainboard(111);
    }
}
