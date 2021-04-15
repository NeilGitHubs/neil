package com.hankun.neil.design_patterns.chain_responsibility;

/**
 * @author neil
 * @ClassName: ConcreteHandler1
 * @Description: TODO
 * @date 2021/4/15 10:50
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}