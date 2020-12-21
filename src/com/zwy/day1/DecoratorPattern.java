package com.zwy.day1;

/**
 * @Author ：zwy
 * @Date ：2020/12/20 14:46
 * @Version ：1.0
 * @Description ：设计模式 - 5、装饰器模式
 *  *                将原有的对象作为参数传入，可以添加新的功能
 **/
public class DecoratorPattern{
    public static void main(String[] args) {
        new RobotDecorator(new FirstRobot()).doMoreThing();
    }
}

interface Robot {
    void doSomething();
}

class FirstRobot implements Robot{

    @Override
    public void doSomething() {
        System.out.println("唱歌");
        System.out.println("对话");
    }
}

class RobotDecorator implements Robot{
    private Robot robot;
    public RobotDecorator(Robot robot){
        this.robot = robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();

    }

    public void doMoreThing(){
        robot.doSomething();
        System.out.println("扫地、跳舞");
    }
}
