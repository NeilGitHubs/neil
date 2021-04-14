package com.hankun.neil.design_patterns.memento;

/**
 * 这个设计模式资源消耗太大，真的不多见
 * 也许StateManageableMessageContext接口算一个吧
 *
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/14 16:54
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.showState();
        caretaker.addMemento("version0",originator.createMemento());

        originator.addVersion();
        originator.showState();

        originator.readMemento(caretaker.getMemento("version0"));
        originator.showState();
    }
}
