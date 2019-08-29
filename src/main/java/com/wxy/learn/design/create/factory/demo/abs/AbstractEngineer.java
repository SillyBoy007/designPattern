package com.wxy.learn.design.create.factory.demo.abs;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;

public class AbstractEngineer {
    public void makeComputer(AbstractFactory as){
        this.prepare(as);
    }

    public void prepare(AbstractFactory as){
        Cpu cpu = as.createCpu();
        Mainboard mainBoard = as.createMainBoard();

        cpu.calculate();
        mainBoard.installCPU();
    }
}
