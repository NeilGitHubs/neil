package com.hankun.neil.design_patterns.chain_responsibility;

/**
 * 常用的设计模式，比如mvc的filter，可以实现权限的热插拔控制，而且不用spi就可以
 * ver_jdk中实现了拦截器版本的责任了模式，使用的jdk代理实现
 * tomcat源码中页大量使用了责任了模式
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/15 10:51
 */
public class Test {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
