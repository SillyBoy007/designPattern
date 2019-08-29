package com.wxy.learn.design.create.factory.demo.abs;

import com.wxy.learn.design.create.factory.component.Cpu;
import com.wxy.learn.design.create.factory.component.Mainboard;

/**
 * 抽象工厂类
 */
public interface AbstractFactory {
    Cpu createCpu();
    Mainboard createMainBoard();
}
