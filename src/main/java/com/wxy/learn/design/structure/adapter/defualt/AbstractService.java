package com.wxy.learn.design.structure.adapter.defualt;

/**
 * 缺省适配器
 *
 * 适配器模式的用意是要改变源的接口，以便于目标接口相容。缺省适配的用意稍有不同，它是为了方便建立一个不平庸的适配器类而提供的一种平庸实现。
 *
 * 在任何时候，如果不准备实现一个接口的所有方法时，就可以使用“缺省适配模式”制造一个抽象类，给出所有方法的平庸的具体实现。
 * 这样，从这个抽象类再继承下去的子类就不必实现所有的方法了。
 */
public interface AbstractService {
     void serviceOperation1();
     int serviceOperation2();
     String serviceOperation3();
}
