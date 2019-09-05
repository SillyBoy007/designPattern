package com.wxy.learn.design.create.prototype.simple;

/**
 * 客户端角色
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(Prototype example){
        //需要创建原型接口的对象
        Prototype copyPrototype = prototype.clone();

    }

    public static void main(String[] args) {
        CopyTypeOne prototype = new CopyTypeOne();
        prototype.setName("jk");
        Prototype clone = prototype.clone();

        System.out.println(clone);

        CopyTypeTwo prototype2 = new CopyTypeTwo();
        prototype2.setAge(1);
        Prototype clone2 = prototype2.clone();

        System.out.println(clone2);

    }
}
