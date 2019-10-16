package com.wxy.learn.design.action.mediator.example;

/**
 * 同事类
 */
public class PartnerA extends AbstractCardPartner {

    public PartnerA(int money) {
        super(money);
    }

    @Override
    public void ChangeMoney(int money, AbstractCardPartner other) {
        Money += money;
        other.Money -= money;
    }

}
