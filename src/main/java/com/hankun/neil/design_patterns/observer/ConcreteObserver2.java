package com.hankun.neil.design_patterns.observer;

/**
 * @author neil
 * @ClassName: ConcreteObserver1
 * @Description: TODO
 * @date 2021/4/15 9:35
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
