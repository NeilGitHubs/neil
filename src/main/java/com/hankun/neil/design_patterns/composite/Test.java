package com.hankun.neil.design_patterns.composite;

/**
 * 组合模式的主要优点有：
 * 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 * 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 *
 * 其主要缺点是：
 * 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 * 不容易限制容器中的构件；
 * 不容易用继承的方法来增加构件的新功能；
 * @author neil
 * @ClassName: composite
 * @Description: TODO
 * @date 2021/4/19 11:08
 */
public class Test {
//    public static void main(String[] args) {
//        Component c0 = new Composite();
//        Component c1 = new Composite();
//        Component leaf1 = new Leaf("1");
//        Component leaf2 = new Leaf("2");
//        Component leaf3 = new Leaf("3");
//        c0.add(leaf1);
//        c0.add(c1);
//        c1.add(leaf2);
//        c1.add(leaf3);
//        c0.operation();
//    }

//    MyBatis中有一个SqlNode接口，下面很多一级标签
//    HashMap中有一个putAll方法，参数是一个Map，这就是一种组合模式的体现
}
