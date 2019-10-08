package com.wxy.learn.design.create.abstractfactory.demo;

import com.wxy.learn.design.create.abstractfactory.component.Cpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.AmdCpu;

public class AmdCpuFactory implements MethodCpu {

    @Override
    public Cpu getCpuInstance(String name) {
        return new AmdCpu(222);
    }
}
