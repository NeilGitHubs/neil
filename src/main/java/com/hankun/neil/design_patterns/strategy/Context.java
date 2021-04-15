package com.hankun.neil.design_patterns.strategy;

/**
 * @author neil
 * @ClassName: Context
 * @Description: TODO
 * @date 2021/4/15 11:23
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
