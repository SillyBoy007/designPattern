package com.wxy.learn.design.create.prototype.register;

import java.io.Serializable;

public class ConcretePrototype1 implements Prototype,Serializable {
    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Now in Prototype1 , name = " + this.name;
    }
}
