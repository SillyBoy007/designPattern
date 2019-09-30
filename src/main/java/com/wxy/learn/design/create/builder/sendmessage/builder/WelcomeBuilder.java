package com.wxy.learn.design.create.builder.sendmessage.builder;

import com.wxy.learn.design.create.builder.sendmessage.product.WelcomeMessage;

public class WelcomeBuilder extends Builder {
    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }
    @Override
    public void buildBody() {
        // TODO Auto-generated methodfactory stub
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildSubject() {
        // TODO Auto-generated methodfactory stub
        msg.setSubject("欢迎标题");
    }
}
