package com.wxy.learn.design.action.mediator.example;

/**
 * 抽象同事类
 */
public abstract class AbstractCardPartner {
    public int Money;

    public AbstractCardPartner(int money) {
        Money = money;
    }

    public abstract void ChangeMoney(int money, AbstractCardPartner other);

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
}
