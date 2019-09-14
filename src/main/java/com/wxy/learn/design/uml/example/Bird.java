package com.wxy.learn.design.uml.example;

import com.wxy.learn.design.uml.example.model.Wing;

/**
 * 继承关系
 */
public class Bird extends Animal {
    public String feather;
    public String tooth;
    /**
     * 鸟和翅膀是合成组合关系
     */
    private Wing wing;

    public Bird() {
        this.wing = new Wing();
    }

    public void layAggs(){}

}
