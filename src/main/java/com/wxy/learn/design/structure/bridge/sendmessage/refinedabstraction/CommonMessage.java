package com.wxy.learn.design.structure.bridge.sendmessage.refinedabstraction;


import com.wxy.learn.design.structure.bridge.sendmessage.abstraction.AbstractMessage;
import com.wxy.learn.design.structure.bridge.sendmessage.implementor.MessageImplementor;

/**
 * 普通类消息
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }
    @Override
    public void sendMessage(String message, String toUser) {
        // 对于普通消息，直接调用父类方法，发送消息即可
        super.sendMessage(message, toUser);
    }
}