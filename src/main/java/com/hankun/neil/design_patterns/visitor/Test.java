package com.hankun.neil.design_patterns.visitor;

/**
 * 这个模式也不常用，哪儿来那么多访问者，而且这货要用那么多类，类爆炸太酸爽了
 * 迭代器模式和组合模式一般和该模式很好配合
 * 见过的应用为BeanDefinitionVisitor，为了扩展留了访问者，但其实只有一个访问者，哈哈
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/14 17:39
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
