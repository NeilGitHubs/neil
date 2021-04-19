package com.hankun.neil.design_patterns.decorator;

/**
 * 装饰器模式的主要优点有：
 * 装饰器是继承的有力补充，比继承灵活，在不改变原有对象的情况下，动态的给一个对象扩展功能，即插即用
 * 通过使用不用装饰类及这些装饰类的排列组合，可以实现不同效果
 * 装饰器模式完全遵守开闭原则
 *
 * 装饰器模式主要包含以下角色:
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 具体构件（ConcreteComponent）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/19 10:26
 */
public class Test {
}


//在 Spring 中，TransactionAwareCacheDecorator 类相当于装饰器模式中的抽象装饰角色，主要用来处理事务缓存
//public class TransactionAwareCacheDecorator implements Cache {
//    private final Cache targetCache;
//    /**
//     * Create a new TransactionAwareCache for the given target Cache.
//     * @param targetCache the target Cache to decorate
//     */
//    public TransactionAwareCacheDecorator(Cache targetCache) {
//        Assert.notNull(targetCache, "Target Cache must not be null");
//        this.targetCache = targetCache;
//    }
//    /**
//     * Return the target Cache that this Cache should delegate to.
//     */
//    public Cache getTargetCache() {
//        return this.targetCache;
//    }
//    ......
//}