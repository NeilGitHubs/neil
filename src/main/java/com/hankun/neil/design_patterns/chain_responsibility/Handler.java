package com.hankun.neil.design_patterns.chain_responsibility;

/**
 * @author neil
 * @ClassName: Handler
 * @Description: TODO
 * @date 2021/4/15 10:49
 */
public abstract class Handler {
    private Handler next;
    public void setNext(Handler next) {
        this.next = next;
    }
    public Handler getNext() {
        return next;
    }
    //处理请求的方法
    public abstract void handleRequest(String request);
}
