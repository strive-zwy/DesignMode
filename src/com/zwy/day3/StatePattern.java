package com.zwy.day3;

/**
 * @Author ：zwy
 * @Date ：2021/1/13 16:28
 * @Version ：1.0
 * @Description ：设计模式 - 9、状态模式
 **/

public class StatePattern {
    public static void main(String[] args) {
        Context zhangSan = new Context();
        zhangSan.changeState(new Happy());
        zhangSan.doSomething();
        zhangSan.changeState(new Angry());
        zhangSan.doSomething();
        zhangSan.changeState(new Sad());
        zhangSan.doSomething();
    }
}

abstract class State{
    abstract void doWork();
}

class Happy extends State{

    @Override
    void doWork() {
        System.out.println("积极主动");
    }
}

class Angry extends State{

    @Override
    void doWork() {
        System.out.println("无精打采");
    }
}

class Sad extends State{

    @Override
    void doWork() {
        System.out.println("啥也不干");
    }
}

class Context{
    private State state;
    public void changeState(State state){
        this.state = state;
    }
    public void doSomething(){
        state.doWork();
    }
}


