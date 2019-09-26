package com.wxy.learn.design.action.mediator.example;

public abstract class AbstractMediator {
    protected AbstractCardPartner A;
    protected AbstractCardPartner B;

    public AbstractMediator(AbstractCardPartner a, AbstractCardPartner b)
    {
        A = a;
        B = b;
    }

    public abstract void AWin(int money,AbstractCardPartner abstractCardPater);
    public abstract void BWin(int money,AbstractCardPartner abstractCardPater);
}
