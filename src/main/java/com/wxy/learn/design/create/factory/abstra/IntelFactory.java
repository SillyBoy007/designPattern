package com.wxy.learn.design.create.factory.abstra;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.component.impl.IntelCpu;
import com.wxy.learn.design.create.factory.component.impl.IntelMainboard;

public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(755);
    }
}
