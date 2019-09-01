package com.wxy.learn.design.create.builder.sendmessage.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 抽象类AutoMessage源代码，send()操作仅仅是示意性的，并没有给出任何发送电子邮件的代码。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AutoMessage {
    //收件人地址
    private String to;
    //发件人地址
    private String from;
    //标题
    private String subject;
    //内容
    private String body;
    //发送日期
    private Date sendDate;

    public void send(){
        System.out.println("收件人地址：" + to);
        System.out.println("发件人地址：" + from);
        System.out.println("标题：" + subject);
        System.out.println("内容：" + body);
        System.out.println("发送日期：" + sendDate);
    }


}
