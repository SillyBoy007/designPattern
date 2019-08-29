package com.wxy.learn.design.create.factory.demo.simple;

public class Client {
    public static void main(String[] args) {
        SimpleEngineer se = new SimpleEngineer();
        se.makeComputer(1,1);
    }
}
