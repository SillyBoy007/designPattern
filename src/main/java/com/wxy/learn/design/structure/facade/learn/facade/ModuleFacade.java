package com.wxy.learn.design.structure.facade.learn.facade;

import com.wxy.learn.design.structure.facade.learn.subsystem.ModuleA;
import com.wxy.learn.design.structure.facade.learn.subsystem.ModuleB;
import com.wxy.learn.design.structure.facade.learn.subsystem.ModuleC;

/**
 * 使用门面模式还有一个附带的好处，就是能够有选择性地暴露方法。一个模块中定义的方法可以分成两部分，一部分是给子系统外部使用的，一部分是子系统内部模块之间相互调用时使用的。
 * 有了Facade类，那么用于子系统内部模块之间相互调用的方法就不用暴露给子系统外部了。
 */
public class ModuleFacade {

    ModuleA a = new ModuleA();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();
    /**
     * 下面这些是A、B、C模块对子系统外部提供的方法
     */
    public void a1(){
        a.a1();
    }
    public void b1(){
        b.b1();
    }
    public void c1(){
        c.c1();
    }
}
