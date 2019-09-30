package com.wxy.learn.design.create.methodfactory.demo;

import com.wxy.learn.design.create.factory.abstra.AbstractFactory;
import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.component.impl.IntelCpu;
import com.wxy.learn.design.create.factory.component.impl.IntelMainboard;

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
