package com.zwy;

/**
 * @Author zwy
 * @Date 2020/12/20 13:22
 * @Version 1.0
 * @Description 设计模式 - 1、单例模式
 **/

public class Singleton {

    // 饿汉式 不管你用不用，先准备好
    /*private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }*/

    //懒汉式 等你用的时候再准备
    private static Singleton singleton;

    public synchronized static Singleton getInstance(){
        if (singleton == null)
            singleton = new Singleton();
            return singleton;
    }

}

class  test{

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        if (s == s1) System.out.println(true);

    }

}
