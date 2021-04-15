package com.hankun.neil.design_patterns.chain_responsibility.ver_jdk;

import java.lang.reflect.Method;

/**
 * @author neil
 * @ClassName: Interceptor1
 * @Description: TODO
 * @date 2021/4/15 10:58
 */
public class Interceptor1 implements Interceptor {

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器1的before方法");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {

    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器1的after方法");
    }

}
