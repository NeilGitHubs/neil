package com.hankun.neil.design_patterns.builder;

/**
 * @author neil
 * @ClassName: Product
 * @Description: TODO
 * @date 2021/4/19 11:19
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA) {
        this.partA = partA;
    }
    public void setPartB(String partB) {
        this.partB = partB;
    }
    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show() {
        //显示产品的特性
    }
}
