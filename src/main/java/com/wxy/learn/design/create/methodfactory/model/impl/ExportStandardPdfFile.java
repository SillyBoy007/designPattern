package com.wxy.learn.design.create.methodfactory.model.impl;

import com.wxy.learn.design.create.methodfactory.model.ExportFile;

public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        // TODO Auto-generated methodfactory stub
        /**
         * 业务逻辑
         */
        System.out.println("导出标准PDF文件");
        return true;
    }
}
