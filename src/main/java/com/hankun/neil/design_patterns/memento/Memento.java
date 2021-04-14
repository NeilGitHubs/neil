package com.hankun.neil.design_patterns.memento;

/**
 * @author neil
 * @ClassName: Memento
 * @Description: TODO
 * @date 2021/4/14 16:53
 */
public class Memento {
    private State state;

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
