package com.wxy.learn.design.create.factory.test.method;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.impl.IntelCpu;

public class ItelCpuFactory implements MethodCpu {
    @Override
    public Cpu getCpuInstance(String name) {
        return new IntelCpu(111);
    }
}
