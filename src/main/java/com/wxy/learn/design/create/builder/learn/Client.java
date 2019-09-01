package com.wxy.learn.design.create.builder.learn;

import com.wxy.learn.design.create.builder.learn.builder.Builder;
import com.wxy.learn.design.create.builder.learn.builder.ConcreteBuilder;
import com.wxy.learn.design.create.builder.learn.director.Director;
import com.wxy.learn.design.create.builder.learn.product.Product;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getKeyboard());
        System.out.println(product.getMouse());
    }
}
