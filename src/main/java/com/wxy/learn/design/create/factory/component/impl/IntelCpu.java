package com.wxy.learn.design.create.factory.component.impl;

import com.wxy.learn.design.create.factory.component.Cpu;

public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated methodfactory stub
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
