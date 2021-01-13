package com.zwy.day3;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author ：zwy
 * @Date ：2021/1/13 16:57
 * @Version ：1.0
 * @Description ：设计模式 - 10、策略模式模式
 **/

public class StrategyPattern {
    public static void main(String[] args) {
        StrategyContext c = new StrategyContext();
        ConcreteStrategyA ca = new ConcreteStrategyA();
        c.setStrategy(ca);
        c.strategyMethod();
        System.out.println("-----------------");
        ConcreteStrategyB cb = new ConcreteStrategyB();
        c.setStrategy(cb);
        c.strategyMethod();
        System.out.println("-----------------");
        ConcreteStrategyC cc = new ConcreteStrategyC();
        c.setStrategy(cc);
        c.strategyMethod();
    }
}

interface Strategy{
    public void strategyMethod();
}

class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("A策略方法被访问");
    }
}
class ConcreteStrategyB implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("B策略方法被访问");
    }
}
class ConcreteStrategyC implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("C策略方法被访问");
    }
}

class StrategyContext{
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
