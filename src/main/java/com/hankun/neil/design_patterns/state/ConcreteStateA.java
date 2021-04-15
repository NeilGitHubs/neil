package com.hankun.neil.design_patterns.state;

/**
 * @author neil
 * @ClassName: ConcreteStateA
 * @Description: TODO
 * @date 2021/4/15 10:27
 */
public class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
