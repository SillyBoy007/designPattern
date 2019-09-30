package com.wxy.learn.design.create.methodfactory.learn;

import com.wxy.learn.design.create.methodfactory.model.ExportFile;
import com.wxy.learn.design.create.methodfactory.model.impl.ExportFinancialPdfFile;
import com.wxy.learn.design.create.methodfactory.model.impl.ExportStandardPdfFile;

public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated methodfactory stub
        if("standard".equals(type)){

            return new ExportStandardPdfFile();

        }else if("financial".equals(type)){

            return new ExportFinancialPdfFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
