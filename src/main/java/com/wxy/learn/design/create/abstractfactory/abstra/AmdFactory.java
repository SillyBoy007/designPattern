package com.wxy.learn.design.create.abstractfactory.abstra;

import com.wxy.learn.design.create.abstractfactory.component.Cpu;
import com.wxy.learn.design.create.abstractfactory.component.Mainboard;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelCpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelMainboard;

public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        // TODO Auto-generated methodfactory stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated methodfactory stub
        return new IntelMainboard(938);
    }

}
