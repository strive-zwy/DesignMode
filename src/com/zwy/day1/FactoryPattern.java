package com.zwy.day1;

/**
 * @Author ：zwy
 * @Date ：2020/12/20 14:04
 * @Version ：1.0
 * @Description ：设计模式 - 3、工厂（方法）模式
 *                跟简单工厂相比，在新增新产品时，只需新增新的产品工厂实现工厂接口，
 *                不用修改原有代码。（新增优于修改）
 **/

public class FactoryPattern {
    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();
        Phone p = factory.createPhone();
        p.print();
    }
}

interface Phone{
    void print();
}

class IPhone implements Phone{

    @Override
    public void print() {
        System.out.println("产品 IPhone");
    }
}

class HuaweiPhone implements Phone{

    @Override
    public void print() {
        System.out.println("产品 Huawei ");
    }
}

interface Factory{
    Phone createPhone();
}

class IPhoneFactory implements Factory{

    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}

class HuaweiFactory implements Factory{

    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}

