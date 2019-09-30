package com.wxy.learn.design.create.methodfactory.learn;

import com.wxy.learn.design.create.methodfactory.model.ExportFile;
import com.wxy.learn.design.create.methodfactory.model.impl.ExportFinancialHtmlFile;
import com.wxy.learn.design.create.methodfactory.model.impl.ExportStandardHtmlFile;

public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated methodfactory stub
        if("standard".equals(type)){

            return new ExportStandardHtmlFile();

        }else if("financial".equals(type)){

            return new ExportFinancialHtmlFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
