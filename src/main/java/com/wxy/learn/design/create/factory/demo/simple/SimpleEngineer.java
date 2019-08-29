package com.wxy.learn.design.create.factory.demo.simple;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;
import com.wxy.learn.design.create.factory.simple.MainboardFactory;

/**
 * @author wangxiayun
 * @since 2019-08-29
 */
public class SimpleEngineer {
    public void makeComputer(int type1,int type2){
       this.prepare(type1,type2);
    }

    private void prepare(int type1,int type2){
        Cpu cpu = CpuFactory.createCpu(type1);
        Mainboard mainboard = MainboardFactory.createMainboard(type2);

        cpu.calculate();
        mainboard.installCPU();
    }
}
