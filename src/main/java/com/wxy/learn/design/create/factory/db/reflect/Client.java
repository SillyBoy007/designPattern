package com.wxy.learn.design.create.factory.db.reflect;

import com.wxy.learn.design.create.factory.db.model.IUser;

public class Client {
    public static void main(String[] args) {
        IUser user = DataAccess.createUser();
        user.saveUser();
    }
}
