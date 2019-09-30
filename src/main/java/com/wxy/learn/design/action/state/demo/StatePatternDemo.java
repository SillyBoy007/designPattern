package com.wxy.learn.design.action.state.demo;

/**
 * 从上面可以看出，环境类Context的行为request()是委派给某一个具体状态类的。通过使用多态性原则，可以动态改变环境类Context的属性State的内容，
 * 使其从指向一个具体状态类变换到指向另一个具体状态类，从而使环境类的行为request()由不同的具体状态类来执行。
 */
public class StatePatternDemo {
    public static void main(String... args) {
        Context context = new Context();

        // 初始为开始状态
        context = context.setState(new StartState());
        // 切换为关闭状态
        context.close();
        // 切换为开始状态
        context.start();
    }

}
