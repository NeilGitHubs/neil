package com.hankun.neil.design_patterns.visitor;

/**
 * @author neil
 * @ClassName: Visitor
 * @Description: TODO
 * @date 2021/4/14 17:37
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
