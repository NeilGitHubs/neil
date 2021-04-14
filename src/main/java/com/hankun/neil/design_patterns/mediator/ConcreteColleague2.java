package com.hankun.neil.design_patterns.mediator;

/**
 * 具体同事类
 * @author neil
 * @ClassName: ConcreteColleague1
 * @Description: TODO
 * @date 2021/4/14 17:59
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }
    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}

