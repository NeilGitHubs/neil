package com.hankun.neil.design_patterns.chain_responsibility.ver_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @author neil
 * @ClassName: InterceptorJdkProxy
 * @Description: TODO
 * @date 2021/4/15 11:01
 */
public class InterceptorJdkProxy implements InvocationHandler {
    private Object target;//真实对象
    private String interceptorClass = null;//拦截器全限定类名

    public InterceptorJdkProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    public static Object bind(Object target,String interceptorClass) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InterceptorJdkProxy(target, interceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(interceptorClass == null) {
            return method.invoke(proxy, args);
        }else {
            Object result = null;
            Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
            if(interceptor.before(proxy, target, method, args)) {
                result = method.invoke(target, args);
            }else {
                interceptor.around(proxy, target, method, args);
            }
            //调用后置方法
            interceptor.after(proxy, target, method, args);
            return result;
        }
    }

    public static void main(String[] args) {
        IDoSomething proxy1 = (IDoSomething) InterceptorJdkProxy.bind(new DoSomething(), "com.hankun.neil.design_patterns.chain_responsibility.ver_jdk.Interceptor1");
        IDoSomething proxy2 = (IDoSomething) InterceptorJdkProxy.bind(proxy1, "com.hankun.neil.design_patterns.chain_responsibility.ver_jdk.Interceptor2");
        IDoSomething proxy3 = (IDoSomething) InterceptorJdkProxy.bind(proxy2, "com.hankun.neil.design_patterns.chain_responsibility.ver_jdk.Interceptor3");
        proxy3.say();
    }
}
