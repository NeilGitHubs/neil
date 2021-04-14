package com.hankun.neil.design_patterns.visitor;

/**
 * @author neil
 * @ClassName: ConcreteElementA
 * @Description: TODO
 * @date 2021/4/14 17:38
 */
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA() {
        return "具体元素A的操作。";
    }
}
