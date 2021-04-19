package com.hankun.neil.design_patterns.flyweight;

/**
 * 享元模式的定义提出了两个要求，细粒度和共享对象。因为要求细粒度，所以不可避免地会使对象数量多且性质相近，此时我们就将这些对象的信息分为两个部分：内部状态和外部状态。
 * 内部状态指对象共享出来的信息，存储在享元信息内部，并且不回随环境的改变而改变；
 * 外部状态指对象得以依赖的一个标记，随环境的改变而改变，不可共享。
 *
 * 比如，连接池中的连接对象，保存在连接对象中的用户名、密码、连接URL等信息，在创建对象的时候就设置好了，不会随环境的改变而改变，这些为内部状态。而当每个连接要被回收利用时，我们需要将它标记为可用状态，这些为外部状态。
 *
 * 享元模式的本质是缓存共享对象，降低内存消耗。
 * 1. 模式的结构
 * 享元模式的主要角色有如下。
 * 抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 * 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 * 非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/19 10:34
 */
public class Test {

//    public static void main(String[] args) {
//        FlyweightFactory factory = new FlyweightFactory();
//        Flyweight f01 = factory.getFlyweight("a");
//        Flyweight f02 = factory.getFlyweight("a");
//        Flyweight f03 = factory.getFlyweight("a");
//        Flyweight f11 = factory.getFlyweight("b");
//        Flyweight f12 = factory.getFlyweight("b");
//        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
//        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
//        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
//        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
//        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
//    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;

        System.out.println(s1 == s2); //true 由于s2指向的字面量"hello"在常量池中已经存在（s1先于s2），于是JVM就返回这个字面量绑定的引用，所以s1==s2。
        System.out.println(s1 == s3); //true s3中字面量的拼接其实就是"hello"，JVM在编译期间就已经对它进行了优化，所以s1和s3也是相等的。
        System.out.println(s1 == s4); //false s4中的new String（"lo"）生成了两个对象：lo和new String（"lo"）。lo存在于字符串常量池中，new String（"lo"）存在于堆中，String s4 = "hel" + new String（"lo"）实质上是两个对象的相加，编译器不会进行优化，相加的结果存在于堆中，而s1存在于字符串常量池中，当然不相等。
        System.out.println(s1 == s5); //false
        System.out.println(s4 == s5); //false s4和s5的结果都在堆中，不用说，肯定不相等。
        System.out.println(s1 == s6); //true s5.intern（）方法能使一个位于堆中的字符串在运行期间动态地加入字符串常量池（字符串常量池的内容是在程序启动的时候就已经加载好了的）。如果字符串常量池中有该对象对应的字面量，则返回该字面量在字符串常量池中的引用；否则，复制一份该字面量到字符串常量池并返回它的引用。因此s1==s6输出true。
        System.out.println(s1 == s9); //false 同 s1 == s4
    }
//    String类是由final修饰的，当以字面量的形式创建String变量时，JVM会在编译期间就把该字面量"hello"放到字符串常量池中，在Java启动的时候就已经加载到内存中了。这个字符串常量池的特点就是有且只有一份相同的字面量。如果有其他相同的字面量，则JVM返回这个字面量的引用；如果没有相同的字面量，则在字符串常量池中创建这个字面量并返回它的引用。
//
//    由于s2指向的字面量"hello"在常量池中已经存在（s1先于s2），于是JVM就返回这个字面量绑定的引用，所以s1==s2。
//
//    s3中字面量的拼接其实就是"hello"，JVM在编译期间就已经对它进行了优化，所以s1和s3也是相等的。
//
//    s4中的new String（"lo"）生成了两个对象：lo和new String（"lo"）。lo存在于字符串常量池中，new String（"lo"）存在于堆中，String s4 = "hel" + new String（"lo"）实质上是两个对象的相加，编译器不会进行优化，相加的结果存在于堆中，而s1存在于字符串常量池中，当然不相等。s1==s9的原理也一样。
//
//    s4和s5的结果都在堆中，不用说，肯定不相等。
//
//    s5.intern（）方法能使一个位于堆中的字符串在运行期间动态地加入字符串常量池（字符串常量池的内容是在程序启动的时候就已经加载好了的）。如果字符串常量池中有该对象对应的字面量，则返回该字面量在字符串常量池中的引用；否则，复制一份该字面量到字符串常量池并返回它的引用。因此s1==s6输出true。
}
