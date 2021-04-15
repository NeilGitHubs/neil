package com.hankun.neil.design_patterns.observer.ver_jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author neil
 * @ClassName: Bear
 * @Description: TODO
 * @date 2021/4/15 9:45
 */
public class Bear implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
