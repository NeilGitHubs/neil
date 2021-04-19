package com.hankun.neil.design_patterns.abstractFactory;

/**
 *
 * 抽象工厂模式通常适用于以下场景：
 * 当需要创建的对象是一系列相互关联或相互依赖的产品族时，如电器工厂中的电视机、洗衣机、空调等。
 * 系统中有多个产品族，但每次只使用其中的某一族产品。如有人只喜欢穿某一个品牌的衣服和鞋。
 * 系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构。
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/19 13:41
 */
public class Test {
    public static void main(String[] args) {

    }

}
//interface AbstractFactory {
//    public Product1 newProduct1();
//    public Product2 newProduct2();
//}
//
//class ConcreteFactory1 implements AbstractFactory {
//    public Product1 newProduct1() {
//        System.out.println("具体工厂 1 生成-->具体产品 11...");
//        return new ConcreteProduct11();
//    }
//    public Product2 newProduct2() {
//        System.out.println("具体工厂 1 生成-->具体产品 21...");
//        return new ConcreteProduct21();
//    }
//}