package com.wxy.learn.design.structure.bridge.sendmessage.concreteimplementor;

import com.wxy.learn.design.structure.bridge.sendmessage.implementor.MessageImplementor;

/**
 * 系统内短消息的实现类
 */
public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法，发送消息'"+message+"'给"+toUser);
    }
}
