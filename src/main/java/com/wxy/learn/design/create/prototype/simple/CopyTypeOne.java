package com.wxy.learn.design.create.prototype.simple;

import lombok.Data;

import java.io.Serializable;


/**
 * 具体原型角色
 */
@Data
public class CopyTypeOne implements Prototype,Serializable {
    private String name;

    @Override
    public Prototype clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        CopyTypeOne prototype = new CopyTypeOne();
        prototype.setName("wang");
        return prototype;
    }

}
