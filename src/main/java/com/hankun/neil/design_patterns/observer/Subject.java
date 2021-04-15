package com.hankun.neil.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neil
 * @ClassName: Subject
 * @Description: TODO
 * @date 2021/4/15 9:34
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    // 增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }
    // 删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    public abstract void notifyObserver(); // 通知观察者方法
}

