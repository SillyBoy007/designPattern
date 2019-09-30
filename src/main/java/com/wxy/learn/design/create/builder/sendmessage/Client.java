package com.wxy.learn.design.create.builder.sendmessage;

import com.wxy.learn.design.create.builder.sendmessage.builder.Builder;
import com.wxy.learn.design.create.builder.sendmessage.builder.GoodbyeBuilder;
import com.wxy.learn.design.create.builder.sendmessage.director.Director;
import com.wxy.learn.design.create.builder.sendmessage.product.AutoMessage;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated methodfactory stub
        Builder builder = new GoodbyeBuilder();
        Director director = new Director(builder);
        AutoMessage message = director.construct("toAddress@126.com", "fromAddress@126.com");
        System.out.println(message);

    }
}
