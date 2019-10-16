package com.wxy.learn.design.action.mediator.example;

/**
 * 具体中介者
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractCardPartner a, AbstractCardPartner b) {
        super(a, b);
    }

    @Override
    public void AWin(int money, AbstractCardPartner  abstractCardPater) {
        A.Money += money;
        int tmp = abstractCardPater.getMoney() - money;
        abstractCardPater.setMoney(tmp);
    }

    @Override
    public void BWin(int money, AbstractCardPartner abstractCardPater) {
        B.Money += money;
        int tmp = abstractCardPater.getMoney() - money;
        abstractCardPater.setMoney(tmp);
    }
}
