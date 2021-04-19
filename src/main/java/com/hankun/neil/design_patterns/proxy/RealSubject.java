package com.hankun.neil.design_patterns.proxy;

/**
 * @author neil
 * @ClassName: RealSubject
 * @Description: TODO
 * @date 2021/4/15 18:34
 */
class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
