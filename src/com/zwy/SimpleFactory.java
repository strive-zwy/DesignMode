package com.zwy;

/**
 * @Author zwy
 * @Date 2020/12/20 13:40
 * @Version 1.0
 * @Description 设计模式 - 2、简单工厂模式
 **/

public class SimpleFactory {

    public static Product getPro(String type){
        if ("A".equals(type)){
            return new ProA();
        }else {
            return new ProB();
        }
    }

    public static void main(String[] args) {
        Product p = SimpleFactory.getPro("A");
        p.print();
    }

}

abstract class Product{
    public abstract void print();
}

class ProA extends Product{

    @Override
    public void print() {
        System.out.println("产品A");
    }
}

class ProB extends Product{

    @Override
    public void print() {
        System.out.println("产品B");
    }
}
