package com.hankun.neil.design_patterns.mediator;

/**
 * 抽象中介者
 * @author neil
 * @ClassName: Mediator
 * @Description: TODO
 * @date 2021/4/14 17:57
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
