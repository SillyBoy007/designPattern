package com.wxy.learn.design.create.factory.demo.abs;

public class Client {
    public static void main(String[] args) {
        AbstractEngineer abs = new AbstractEngineer();
        AbstractFactory as = new IntelFactory();
        abs.makeComputer(as);
    }
}
