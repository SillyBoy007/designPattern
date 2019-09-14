package com.wxy.learn.design.create.factory.db.method;

import com.wxy.learn.design.create.factory.db.model.AccessUser;
import com.wxy.learn.design.create.factory.db.model.IUser;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
