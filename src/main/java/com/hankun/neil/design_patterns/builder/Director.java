package com.hankun.neil.design_patterns.builder;

/**
 * @author neil
 * @ClassName: Director
 * @Description: TODO
 * @date 2021/4/19 11:20
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
