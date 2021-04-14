package com.hankun.neil.design_patterns.visitor;

/**
 * @author neil
 * @ClassName: Element
 * @Description: TODO
 * @date 2021/4/14 17:38
 */
public interface  Element {
    void accept(Visitor visitor);
}
