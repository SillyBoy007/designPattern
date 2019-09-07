package com.wxy.learn.design.structure.bridge.demo.refinedabstraction;

import com.wxy.learn.design.structure.bridge.demo.implementor.Implementor;
import com.wxy.learn.design.structure.bridge.demo.abstraction.Abstraction;

/**
 * 修正抽象化角色
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    //其他的操作方法
    public void otherOperation(){

    }
}
