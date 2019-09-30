package com.wxy.learn.design.create.methodfactory;

import com.wxy.learn.design.create.methodfactory.model.ExportFile;
import com.wxy.learn.design.create.methodfactory.learn.ExportFactory;
import com.wxy.learn.design.create.methodfactory.learn.ExportHtmlFactory;

public class Client {
    public static void main(String[] args) {
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export("hello,world");
    }
}
