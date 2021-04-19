package com.hankun.neil.design_patterns.bridge;

/**
 * @author neil
 * @ClassName: ConcreteImplementorA
 * @Description: TODO
 * @date 2021/4/19 10:04
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
