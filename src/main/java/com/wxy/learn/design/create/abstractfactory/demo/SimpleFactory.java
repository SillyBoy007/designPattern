package com.wxy.learn.design.create.abstractfactory.demo;

import com.wxy.learn.design.create.abstractfactory.component.Cpu;
import com.wxy.learn.design.create.abstractfactory.component.Mainboard;
import com.wxy.learn.design.create.abstractfactory.component.impl.AmdCpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.AmdMainboard;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelCpu;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelMainboard;

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
