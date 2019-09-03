package com.wxy.learn.design.create.prototype.simple;

import lombok.Data;

/**
 * 具体原型角色
 */
@Data
public class CopyTypeOne implements Prototype {
    private String name;
    private Integer age;

    @Override
    public Prototype clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new CopyTypeOne();
        return prototype;
    }

}
