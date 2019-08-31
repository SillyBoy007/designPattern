package com.wxy.learn.design.create.factory.method;

import com.wxy.learn.design.create.factory.component.ExportFile;
import com.wxy.learn.design.create.factory.component.impl.ExportFinancialPdfFile;
import com.wxy.learn.design.create.factory.component.impl.ExportStandardPdfFile;

public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated method stub
        if("standard".equals(type)){

            return new ExportStandardPdfFile();

        }else if("financial".equals(type)){

            return new ExportFinancialPdfFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
