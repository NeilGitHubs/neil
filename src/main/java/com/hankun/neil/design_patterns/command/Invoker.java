package com.hankun.neil.design_patterns.command;

/**
 * @author neil
 * @ClassName: Invoker
 * @Description: TODO
 * @date 2021/4/15 11:16
 */
public class Invoker {
    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}

