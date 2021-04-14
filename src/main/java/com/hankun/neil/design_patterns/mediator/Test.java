package com.hankun.neil.design_patterns.mediator;

/**
 * 在实际开发中，通常采用以下两种方法来简化中介者模式，使开发变得更简单。
 * 1. 不定义中介者接口，把具体中介者对象实现成为单例。
 * 2. 同事对象不持有中介者，而是在需要的时候直接获取中介者对象并调用。
 * 中介者模式的思想和注册中心的思想是一致的
 * 优点
 * 1、减少了类之间的相互依赖性，将多对多依赖转化成为了一对多依赖，降低了类间的耦合。
 * 2、使用了中介者模式之后，各个类都各司其职，符合了迪米特法则。
 * 缺点
 * 1、当我们的同事角色非常多的时候，中介者对象需要维护非常多的同事角色对象，会使得中介者变得非常庞大，导致难以维护。
 * jdk中的应用
 * JDK 中的 Timer 类，查看 Timer 类的结构，会发现 Timer 类中有很多 schedule() 重载方法，都调用了私有的 sched() 方法
 * @author neil
 * @ClassName: MediatorPattern
 * @Description: TODO
 * @date 2021/4/14 17:57
 */
public class Test {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
