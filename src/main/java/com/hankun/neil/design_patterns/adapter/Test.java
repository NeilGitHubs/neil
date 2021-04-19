package com.hankun.neil.design_patterns.adapter;

/**
 * Spring 使用 Advice（通知）来增强被代理类的功能，Advice 的类型主要有 BeforeAdvice、AfterReturningAdvice、ThrowsAdvice。每种 Advice 都有对应的拦截器，即 MethodBeforeAdviceInterceptor、AfterReturningAdviceInterceptor、ThrowsAdviceInterceptor
 * Spring AOP 的 AdvisorAdapter 类有 4 个实现类，即 SimpleBeforeAdviceAdapter、MethodBeforeAdviceAdapter、AfterReturningAdviceAdapter 和 ThrowsAdviceAdapte
 * 适配器模式在 SpringMVC 中的经典使用体现在它的核心方法 doDispatch 方法中 RequestMappingHandlerAdapter
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/15 18:40
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
