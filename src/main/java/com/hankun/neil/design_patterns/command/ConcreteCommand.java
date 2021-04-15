package com.hankun.neil.design_patterns.command;

/**
 * @author neil
 * @ClassName: ConcreteCommand
 * @Description: TODO
 * @date 2021/4/15 11:15
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    ConcreteCommand() {
        receiver = new Receiver();
    }
    public void execute() {
        receiver.action();
    }
}
