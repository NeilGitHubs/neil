package com.hankun.neil.design_patterns.builder;

/**
 * @author neil
 * @ClassName: ConcreteBuilder
 * @Description: TODO
 * @date 2021/4/19 11:20
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }
    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }
    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
