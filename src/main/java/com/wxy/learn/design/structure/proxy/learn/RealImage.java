package com.wxy.learn.design.structure.proxy.learn;

/**
 *目标对象角色：定义了代理对象所代表的目标对象。
 */
public class RealImage implements Image  {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
