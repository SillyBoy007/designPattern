package com.wxy.learn.design.create.methodfactory.demo;

import com.wxy.learn.design.create.factory.component.Cpu;

public interface MethodCpu  {
    Cpu getCpuInstance(String name);
}
