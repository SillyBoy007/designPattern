package com.wxy.learn.design.create.methodfactory.db.reflect;

import com.wxy.learn.design.create.methodfactory.db.model.IUser;

public class Client {
    public static void main(String[] args) {
        IUser user = DataAccess.createUser();
        user.saveUser();
    }
}
