package com.wxy.learn.design.create.factory.db.method;

import com.wxy.learn.design.create.factory.db.model.IUser;
import com.wxy.learn.design.create.factory.db.model.SqlServerUser;

public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
}
