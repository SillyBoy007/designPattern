package com.wxy.learn.design.action.memento.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人（Caretaker）角色
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}