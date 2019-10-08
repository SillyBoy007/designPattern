package com.wxy.learn.design.create.abstractfactory.demo;

import com.wxy.learn.design.create.abstractfactory.component.Cpu;

public interface MethodCpu  {
    Cpu getCpuInstance(String name);
}
