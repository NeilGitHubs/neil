package com.hankun.neil.design_patterns.chain_responsibility.ver_jdk;

import java.lang.reflect.Method;

/**
 * @author neil
 * @ClassName: Interceptor
 * @Description: TODO
 * @date 2021/4/15 10:59
 */
public interface Interceptor {
    boolean before(Object proxy, Object target, Method method, Object[] args);

    void around(Object proxy, Object target, Method method, Object[] args);

    void after(Object proxy, Object target, Method method, Object[] args);
}
