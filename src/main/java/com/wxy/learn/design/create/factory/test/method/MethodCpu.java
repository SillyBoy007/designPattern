package com.wxy.learn.design.create.factory.test.method;

import com.wxy.learn.design.create.factory.component.Cpu;

public interface MethodCpu  {
    Cpu getCpuInstance(String name);
}
