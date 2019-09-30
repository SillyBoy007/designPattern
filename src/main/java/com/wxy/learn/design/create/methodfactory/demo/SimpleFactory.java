package com.wxy.learn.design.create.methodfactory.demo;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.component.impl.AmdCpu;
import com.wxy.learn.design.create.factory.component.impl.AmdMainboard;
import com.wxy.learn.design.create.factory.component.impl.IntelCpu;
import com.wxy.learn.design.create.factory.component.impl.IntelMainboard;

/**
 * 简单工厂
 */
public class SimpleFactory {
    public Cpu getCpu(int type){
        if (type == 1){
            return new AmdCpu(111);
        }else {
            return new IntelCpu(222);
        }
    }

    public Mainboard getMainboard(int type){
        if (type == 1){
            return new AmdMainboard(111);
        }else {
            return new IntelMainboard(222);
        }
    }
}
