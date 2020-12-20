package com.zwy.day1;

/**
 * @Author ：zwy
 * @Date ：2020/12/20 13:40
 * @Version ：1.0
 * @Description ：设计模式 - 2、简单工厂模式
 *              一个工厂中属于同一大类（Product）的产品 ProA 和 产品 ProB，
 *              工厂在接收到不同参数请求的时候，生产不同的产品
 *              缺点：在新增产品是，必须修改工厂类
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
