package com.wxy.learn.design.structure.bridge.sendmessage.example;

/**
 * 加急消息的接口
 */
public interface UrgencyMessage extends Message  {
    /**
     * 监控指定消息的处理过程
     * @param messageId  被监控的消息编号
     * @return    监控到的消息的处理状态
     */
     Object watch(String messageId);
}
