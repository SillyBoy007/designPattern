package com.wxy.learn.design.structure.adapter.demo;

/**
 * 目标角色
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
     void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
     void sampleOperation2();
}
