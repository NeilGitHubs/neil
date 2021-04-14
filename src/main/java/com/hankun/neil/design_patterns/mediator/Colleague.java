package com.hankun.neil.design_patterns.mediator;

/**
 * 抽象同事类
 * @author neil
 * @ClassName: Colleague
 * @Description: TODO
 * @date 2021/4/14 17:58
 */
abstract class Colleague {
    Mediator mediator;
    void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
