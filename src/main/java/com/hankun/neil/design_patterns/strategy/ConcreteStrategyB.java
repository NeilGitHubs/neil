package com.hankun.neil.design_patterns.strategy;

/**
 * @author neil
 * @ClassName: ConcreteStrategyA
 * @Description: TODO
 * @date 2021/4/15 11:22
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
