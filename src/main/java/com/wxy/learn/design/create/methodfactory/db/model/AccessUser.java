package com.wxy.learn.design.create.methodfactory.db.model;

public class AccessUser implements IUser {
    @Override
    public void saveUser() {
        System.out.println(String.format("%s创建User",AccessUser.class.getName()));
    }

    @Override
    public User getUser(Long id) {
        System.out.println(String.format("%s获取user",this.getClass().getName()));
        return new User();
    }
}
