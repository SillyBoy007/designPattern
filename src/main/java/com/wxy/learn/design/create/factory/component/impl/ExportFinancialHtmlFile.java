package com.wxy.learn.design.create.factory.component.impl;

import com.wxy.learn.design.create.factory.component.ExportFile;

public class ExportFinancialHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("导出财务版HTML文件");
        return true;
    }
}
