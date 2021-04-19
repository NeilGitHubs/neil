package com.hankun.neil.design_patterns.bridge;


/**
 * 可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系。
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/15 18:40
 */
public class Test {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.operation();
    }
}
