package com.zwy.day1;

/**
 * @Author ：zwy
 * @Date ：2020/12/20 14:16
 * @Version ：1.0
 * @Description ：设计模式 - 4、抽象工厂模式
 **/

//抽象工厂
public interface AbstractFactory {
    PhoneDemo createPhone(String prarm);
    Mask createMask(String prarm);

}
//具体工厂
class SuperFactory implements AbstractFactory{

    @Override
    public PhoneDemo createPhone(String prarm) {
        if ("IPhone".equals(prarm)){
            return new Iphone();
        }else {
            return new HuaweiP();
        }
    }

    @Override
    public Mask createMask(String prarm) {
        if ("N95".equals(prarm)){
            return new N95();
        }else {
            return new KN95();
        }
    }
}

//产品大类 - 手机
interface PhoneDemo{
    void print();
}
class Iphone implements PhoneDemo{
    @Override
    public void print() {
        System.out.println("IPhone");
    }
}
class HuaweiP implements PhoneDemo{
    @Override
    public void print() {
        System.out.println("Huawei");
    }
}

//产品大类 - 口罩
interface Mask{
    void print();
}
class N95 implements Mask{
    @Override
    public void print() {
        System.out.println("N95");
    }
}
class KN95 implements Mask{
    @Override
    public void print() {
        System.out.println("KN95");
    }
}

class Text{
    public static void main(String[] args) {
        SuperFactory s = new SuperFactory();
        PhoneDemo p = s.createPhone("IPhone");
        p.print();

    }
}


