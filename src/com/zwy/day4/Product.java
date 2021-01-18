package com.zwy.day4;

/**
 * @Author ：zwy
 * @Date ：2021/1/18 18:47
 * @Version ：1.0
 * @Description ：设计模式 - 12、建造者模式
 **/

// 产品角色：包含多个组成部件的复杂对象
public class Product {

    private String proA;
    private String proB;
    private String proC;

    public void setProA(String proA) {
        this.proA = proA;
    }

    public void setProB(String proB) {
        this.proB = proB;
    }

    public void setProC(String proC) {
        this.proC = proC;
    }

    public void show(){
        System.out.println("产品的特性：" + proA + "、" + proB + "、" + proC );
    }

}

// 抽象建造者：包含创建产品各个子部件的抽象方法。
abstract class Builder{
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}

//  具体建造者：实现了抽象建造者接口。
class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        product.setProA("建造产品A");
    }

    @Override
    public void buildPartB() {
        product.setProB("建造产品B");
    }

    @Override
    public void buildPartC() {
        product.setProC("建造产品C");
    }
}

// 指挥者：调用建造者中的方法完成复杂对象的创建。
class Director{
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construst(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}

// 客户类。
class Client{
    public static void main(String[] args) {
        Builder b = new ConcreteBuilder();
        Director d = new Director(b);
        Product p = d.construst();
        p.show();
    }
}

