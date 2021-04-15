package com.hankun.neil.design_patterns.observer;

/**
 * @author neil
 * @ClassName: ConcreteObserver1
 * @Description: TODO
 * @date 2021/4/15 9:35
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
