package com.wxy.learn.design.create.factory.method;

import com.wxy.learn.design.create.factory.component.ExportFile;

/**
 * 抽象工厂角色
 */
public interface ExportFactory {
    ExportFile factory(String type);
}
