package com.hankun.neil.design_patterns.bridge;

/**
 * @author neil
 * @ClassName: RefinedAbstraction
 * @Description: TODO
 * @date 2021/4/19 10:08
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }
}