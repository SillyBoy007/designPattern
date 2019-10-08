package com.wxy.learn.design.create.abstractfactory.demo;

import com.wxy.learn.design.create.abstractfactory.component.Cpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelCpu;

public class ItelCpuFactory implements MethodCpu {
    @Override
    public Cpu getCpuInstance(String name) {
        return new IntelCpu(111);
    }
}
