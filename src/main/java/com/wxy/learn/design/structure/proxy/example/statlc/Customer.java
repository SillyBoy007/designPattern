package com.wxy.learn.design.structure.proxy.example.statlc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Customer implements IBuyCar {
    private int cash;//购车款

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void buyCar() {
        log.info("buyCar:{}", "买一辆车花费了-->" + cash + "元");
    }
}
