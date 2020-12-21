package com.zwy.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：zwy
 * @Date ：2020/12/21 19:33
 * @Version ：1.0
 * @Description ：设计模式 - 7、观察者模式
 *                定义对象之间一种一对多的依赖关系，是的每当一个对象发生改变时，
 *                其相关依赖对象皆得到通知并被自动更新
 **/

public class ObserverPattern {
    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();
        zhangsan.borrow(new Wangwu());
        zhangsan.borrow(new Lisi());
        zhangsan.setState(1);//张三有钱了，状态改变
        zhangsan.notifyCredits();
    }
}

interface Debit{
    void borrow(Credit credit);
    void notifyCredits();
}

class Zhangsan implements Debit{
    private List<Credit> allCredits = new ArrayList<>();
    private Integer state = 0; //是否有钱  -  1 代表有钱

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public void borrow(Credit credit) {
        allCredits.add(credit);
    }

    @Override
    public void notifyCredits() {
        allCredits.forEach(Credit::takeMoney);
    }
}

interface Credit{
    void takeMoney();
}

class Lisi implements Credit{

    @Override
    public void takeMoney() {
        System.out.println("李四要钱！！");
    }
}

class Wangwu implements Credit{

    @Override
    public void takeMoney() {
        System.out.println("王五要钱！！");
    }
}
