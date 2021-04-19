package com.hankun.neil.design_patterns.adapter;

/**
 * @author neil
 * @ClassName: ClassAdapter
 * @Description: TODO
 * @date 2021/4/15 18:39
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}