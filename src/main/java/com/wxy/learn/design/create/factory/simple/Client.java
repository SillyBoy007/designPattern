package com.wxy.learn.design.create.factory.simple;

/**
 * 虽然通过简单工厂方法解决了：对于装机工程师，只知CPU和主板的接口，而不知道具体实现的问题。
 * 但还有一个问题没有解决，那就是这些CPU对象和主板对象其实是有关系的，需要相互匹配的。
 * 而上面的实现中，并没有维护这种关联关系，CPU和主板是由客户任意选择，这是有问题的。
 * 比如在客户端调用makeComputer时，传入参数为(1,2)，运行结果如下：
 * 观察上面结果就会看出问题。客户选择的是Intel的CPU针脚数为755，而选择的主板是AMD，主板上的CPU插孔是938，根本无法组装，
 * 这就是没有维护配件之间的关系造成的。该怎么解决这个问题呢？　--- 引进抽象工厂模式
 *
 */
public class Client {
    public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,2);
    }
}