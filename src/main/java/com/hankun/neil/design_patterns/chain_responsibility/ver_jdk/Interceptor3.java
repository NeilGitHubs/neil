package com.hankun.neil.design_patterns.chain_responsibility.ver_jdk;

import java.lang.reflect.Method;

/**
 * @author neil
 * @ClassName: Interceptor1
 * @Description: TODO
 * @date 2021/4/15 10:58
 */
public class Interceptor3 implements Interceptor{

    /* (non-Javadoc)
     * @see interceptor.Interceptor#before(java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器3的before方法");
        return true;
    }

    /* (non-Javadoc)
     * @see interceptor.Interceptor#around(java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
    }

    /* (non-Javadoc)
     * @see interceptor.Interceptor#after(java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器3的after方法");
    }

}
