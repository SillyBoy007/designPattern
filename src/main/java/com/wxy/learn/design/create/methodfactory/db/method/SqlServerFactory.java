package com.wxy.learn.design.create.methodfactory.db.method;

import com.wxy.learn.design.create.methodfactory.db.model.IUser;
import com.wxy.learn.design.create.methodfactory.db.model.SqlServerUser;

public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
}
