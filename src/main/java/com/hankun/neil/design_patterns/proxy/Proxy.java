package com.hankun.neil.design_patterns.proxy;

/**
 * @author neil
 * @ClassName: Proxy
 * @Description: TODO
 * @date 2021/4/15 18:35
 */
public class Proxy {
    private RealSubject realSubject;
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
