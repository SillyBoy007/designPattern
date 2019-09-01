package com.wxy.learn.design.create.builder.learn.builder;

import com.wxy.learn.design.create.builder.learn.product.Product;

/**
 * 建造者类
 */
public interface Builder {
    void buildMouse();
    void buildKeyboard();
    Product retrieveResult();
}
