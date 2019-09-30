package com.wxy.learn.design.create.methodfactory.db.method;

import com.wxy.learn.design.create.methodfactory.db.model.AccessUser;
import com.wxy.learn.design.create.methodfactory.db.model.IUser;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
