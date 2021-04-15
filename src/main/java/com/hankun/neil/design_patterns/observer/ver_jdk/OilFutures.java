package com.hankun.neil.design_patterns.observer.ver_jdk;

import java.util.Observable;

/**
 * @author neil
 * @ClassName: OilFutures
 * @Description: TODO
 * @date 2021/4/15 9:44
 */
public class OilFutures extends Observable {
    private float price;
    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        super.setChanged();  //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);    //通知观察者价格改变了
        this.price = price;
    }
}
