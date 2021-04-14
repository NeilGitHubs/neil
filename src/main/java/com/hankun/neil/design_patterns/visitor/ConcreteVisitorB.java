package com.hankun.neil.design_patterns.visitor;

/**
 * @author neil
 * @ClassName: ConcreteVisitorA
 * @Description: TODO
 * @date 2021/4/14 17:37
 */
public class ConcreteVisitorB implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }
    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
