package com.hankun.neil.design_patterns.adapter;

/**
 * @author neil
 * @ClassName: Adaptee
 * @Description: TODO
 * @date 2021/4/15 18:38
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
