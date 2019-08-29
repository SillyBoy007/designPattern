package com.wxy.learn.design.create.factory.demo.simple;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.impl.AmdCpu;
import com.wxy.learn.design.create.factory.component.impl.IntelCpu;

public class CpuFactory {
    public static Cpu createCpu(int type){
        if (type == 1){
            return new AmdCpu(111);
        }else {
            return new IntelCpu(222);

        }
    }
}
