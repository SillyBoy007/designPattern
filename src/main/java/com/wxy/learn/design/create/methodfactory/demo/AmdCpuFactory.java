package com.wxy.learn.design.create.methodfactory.demo;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.impl.AmdCpu;

public class AmdCpuFactory implements MethodCpu {

    @Override
    public Cpu getCpuInstance(String name) {
        return new AmdCpu(222);
    }
}
