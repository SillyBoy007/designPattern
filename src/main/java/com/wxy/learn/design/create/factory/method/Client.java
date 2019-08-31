package com.wxy.learn.design.create.factory.method;

import com.wxy.learn.design.create.factory.component.ExportFile;

public class Client {
    public static void main(String[] args) {
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export("hello,world");
    }
}
