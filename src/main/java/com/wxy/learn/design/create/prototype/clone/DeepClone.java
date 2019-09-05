package com.wxy.learn.design.create.prototype.clone;


import com.wxy.learn.design.create.prototype.register.ConcretePrototype1;
import com.wxy.learn.design.create.prototype.register.Prototype;
import com.wxy.learn.design.create.prototype.register.PrototypeManager;

import java.io.*;

/**
 * 使用序列化实现深克隆
 *
 * 把对象写到流里的过程是序列化(Serialization)过程；而把对象从流中读出来的过程则叫反序列化(Deserialization)过程。
 * 应当指出的是，写到流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。
 　在Java语言里深度克隆一个对象，常常可以先使对象实现Serializable接口，然后把对象（实际上只是对象的拷贝）写到一个流里（序列化），再从流里读回来（反序列化），便可以重建对象。
 */
public class DeepClone {
    public static Object deepClone(Prototype prototype) throws IOException, ClassNotFoundException {
        //将对象写道流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(prototype);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public static void main(String[] args) {
        ConcretePrototype1 one = new ConcretePrototype1();
        one.setName("heh");
        try {
            //被拷贝
            ConcretePrototype1 clone = (ConcretePrototype1) deepClone(one);
            System.out.println(clone);
            one.setName("www");

            ConcretePrototype1 clone2 = (ConcretePrototype1) deepClone(clone);
            System.out.println(clone2);


            PrototypeManager.setPrototype("p1",one);
            Prototype prototype = PrototypeManager.getPrototype("p1");
            System.out.println(prototype);

            PrototypeManager.setPrototype("p2",prototype);
            Prototype prototype2 = PrototypeManager.getPrototype("p2");
            System.out.println(prototype2);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
