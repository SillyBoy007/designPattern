package com.wxy.learn.design.action.mediator.example;

public class PartnerB extends AbstractCardPartner {

    @Override
    public void ChangeMoney(int money, AbstractCardPartner other) {
        Money += money;
        other.Money -= money;
    }
}
