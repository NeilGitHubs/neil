package com.hankun.neil.design_patterns.observer;

/**
 * @author neil
 * @ClassName: ConcreteSubject
 * @Description: TODO
 * @date 2021/4/15 9:35
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Object obs : observers) {
            ((Observer) obs).response();
        }
    }
}
