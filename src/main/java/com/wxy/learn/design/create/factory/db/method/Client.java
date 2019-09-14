package com.wxy.learn.design.create.factory.db.method;

import com.wxy.learn.design.create.factory.db.model.IUser;

public class Client {
    public static void main(String[] args) {
        AccessFactory af = new AccessFactory();
        IUser user = af.createUser();
        user.saveUser();
    }
}
