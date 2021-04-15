package com.hankun.neil.design_patterns.observer.ver_jdk;

import java.util.Observer;

/**
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/15 9:46
 */
public class Test {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
