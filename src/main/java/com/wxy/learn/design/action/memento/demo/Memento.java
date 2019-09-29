package com.wxy.learn.design.action.memento.demo;

/**
 * 备忘录(Memento)角色
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
        }
    }
