package com.wxy.learn.design.create.abstractfactory.demo;

import com.wxy.learn.design.create.abstractfactory.abstra.AbstractFactory;
import com.wxy.learn.design.create.abstractfactory.component.Cpu;
import com.wxy.learn.design.create.abstractfactory.component.Mainboard;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelCpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelMainboard;

public class AbsIntelFactory implements AbstractFactory{

    @Override
    public Cpu createCpu() {
        return new IntelCpu(111);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(111);
    }
}
