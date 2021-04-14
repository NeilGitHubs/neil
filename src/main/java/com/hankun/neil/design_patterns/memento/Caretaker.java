package com.hankun.neil.design_patterns.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neil
 * @ClassName: Caretaker
 * @Description: TODO
 * @date 2021/4/14 16:54
 */
public class Caretaker {
    Map<String,Memento> mementos = new HashMap<>();

    public void addMemento(String key, Memento memento){
        mementos.put(key,memento);
    }

    public Memento getMemento(String key){
        return mementos.get(key);
    }
}
