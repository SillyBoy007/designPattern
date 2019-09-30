package com.wxy.learn.design.create.methodfactory.db.model;

public class SqlServerUser implements IUser {
    @Override
    public void saveUser() {
        System.out.println(String.format("%s创建用户",this.getClass().getName()));
    }

    @Override
    public User getUser(Long id) {
        System.out.println(String.format("%s获取用户",this.getClass().getName()));
        return new User();
    }
}
