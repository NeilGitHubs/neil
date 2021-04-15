package com.hankun.neil.design_patterns.observer.ver_jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author neil
 * @ClassName: Bull
 * @Description: TODO
 * @date 2021/4/15 9:44
 */
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
