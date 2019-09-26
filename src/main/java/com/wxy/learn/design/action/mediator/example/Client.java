package com.wxy.learn.design.action.mediator.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    public static void main(String[] args) {
        AbstractCardPartner A = new PartnerA(30);
        AbstractCardPartner B = new PartnerB(30);

        Mediator mediator = new Mediator(A,B);
        // A赢了B的钱减少
       // A.ChangeMoney(5, B);
        mediator.AWin(5,B);
        log.info("A 现在的钱是：{}", A.Money); // 应该是25
        log.info("B 现在的钱是：{}", B.Money); // 应该是15

        // B赢了A的钱减少
        // B.ChangeMoney(10, A);
        mediator.BWin(10,A);
        log.info("A 现在的钱是：{}", A.Money); // 应该是15
        log.info("B 现在的钱是：{}", B.Money); // 应该是25


    }
}
