package com.wxy.learn.design.create.builder.learn.builder;

import com.wxy.learn.design.create.builder.learn.product.Product;

/**
 * 具体建造者类
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    /**
     * 产品零件构造
     */
    @Override
    public void buildMouse() {
        //构建产品第一个零件
        product.setMouse("鼠标");
    }

    @Override
    public void buildKeyboard() {
        //构建产品的第二个零件
        product.setKeyboard("键盘");
    }

    //产品返还方法
    @Override
    public Product retrieveResult() {
        return product;
    }
}
