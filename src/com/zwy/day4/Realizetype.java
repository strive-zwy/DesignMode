package com.zwy.day4;

/**
 * @Author ：zwy
 * @Date ：2021/1/17 20:43
 * @Version ：1.0
 * @Description ：设计模式 - 11、原型模式
 **/

//具体原型类
public class Realizetype implements Cloneable{

    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}

//原型测试类
class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = obj1.clone();
        System.out.println(obj1 == obj2);

    }
}
