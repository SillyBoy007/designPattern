package com.wxy.learn.design.create.abstractfactory.simple;

import com.wxy.learn.design.create.abstractfactory.component.impl.AmdCpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelCpu;
import com.wxy.learn.design.create.abstractfactory.component.Cpu;

public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}

