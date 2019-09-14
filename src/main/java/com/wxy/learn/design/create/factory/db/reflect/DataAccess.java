package com.wxy.learn.design.create.factory.db.reflect;

import com.wxy.learn.design.create.factory.db.model.IUser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class DataAccess {
    private static final String ASSEMBLYNAME = "com.wxy.learn.design.create.factory.db.model";
    //private static final String DB = "SqlServer";

    public static IUser createUser(){

        try {

            return (IUser) Class.forName(DataAccess.getDbName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getDbName(){
        Properties properties = new Properties();
        InputStream stream = null;
        try {
            stream = DataAccess.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(stream);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (Objects.nonNull(stream)){
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String db = (String) properties.get("db.name");
        return ASSEMBLYNAME.concat(".").concat(db).concat("User");
    }

}
