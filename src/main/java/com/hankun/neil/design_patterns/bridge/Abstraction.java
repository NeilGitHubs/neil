package com.hankun.neil.design_patterns.bridge;

/**
 * @author neil
 * @ClassName: Abstraction
 * @Description: TODO
 * @date 2021/4/19 10:06
 */
abstract class Abstraction {
    protected Implementor imple;
    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void operation();
}
