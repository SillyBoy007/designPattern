package com.wxy.learn.design.create.abstractfactory.simple;

import com.wxy.learn.design.create.abstractfactory.component.impl.AmdMainboard;
import com.wxy.learn.design.create.abstractfactory.component.impl.IntelMainboard;
import com.wxy.learn.design.create.abstractfactory.component.Mainboard;

public class MainboardFactory {
    public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new AmdMainboard(755);
        }else if(type == 2){
            mainboard = new IntelMainboard(938);
        }
        return mainboard;
    }
}