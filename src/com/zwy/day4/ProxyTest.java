package com.zwy.day4;

/**
 * @Author ：zwy
 * @Date ：2021/1/18 20:05
 * @Version ：1.0
 * @Description ：设计模式 - 13、代理模式
 **/

public class ProxyTest {
    public static void main(String[] args) {
        Proxy p = new Proxy();
        p.Request();
    }
}

interface Subject{
    void Request();
}

class RealSubjest implements Subject{

    @Override
    public void Request() {
        System.out.println("访问真实主题方法");
    }
}

class Proxy implements Subject{
    private RealSubjest realSubjest;

    @Override
    public void Request() {
        if (realSubjest == null){
            realSubjest = new RealSubjest();
        }
        proRequest();
        realSubjest.Request();
        postRequest();
    }

    public void proRequest(){
        System.out.println("访问真实主题的预处理");
    }
    public void postRequest(){
        System.out.println("访问真实主题后的处理后续");
    }
}
