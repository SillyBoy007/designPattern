package com.wxy.learn.design.action.command.demo.command;

/**
 * 命令(Command)角色：声明了一个给所有具体命令类的抽象接口。
 */
public interface Order {
    void execute();
}
