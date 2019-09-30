package com.wxy.learn.design.create.methodfactory.learn;

import com.wxy.learn.design.create.methodfactory.model.ExportFile;

/**
 * 抽象工厂角色
 */
public interface ExportFactory {
    ExportFile factory(String type);
}
