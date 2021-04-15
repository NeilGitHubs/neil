package com.hankun.neil.design_patterns.strategy;

/**
 * 常用的设计模式，在电商业务代码中页经常使用
 * 在spring Resource  接口中使用的策略模式
 * InstantiationStrategy 负责使用 Bean 类的默认构造函数、带参构造函数或者工厂方法等来实例化 Bean，是一个策略模式的接口。
 * 在jdk 数组工具类Arrays的一个排序方法sort时，可以传入一个实现了Comparator接口的类，其实就是传入了一个策略类
 *
 * 策略模式的主要优点如下。
 *   多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
 *   策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 *   策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
 *   策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 *   策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离
 * 其主要缺点如下。
 *   客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 *   策略模式造成很多的策略类，增加维护难度。
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/15 11:23
 */
public class Test {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
