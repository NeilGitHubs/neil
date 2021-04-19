package com.hankun.neil.design_patterns.builder;

/**
 * @author neil
 * @ClassName: Builder
 * @Description: TODO
 * @date 2021/4/19 11:20
 */
abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }
}
