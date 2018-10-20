package com.zhcc.designparrten.Observer;

/**
 * Create by ZHCC on 2018/10/19
 */

public class PriceObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Double) {
            System.out.println("价格观察者" + o + "物品价格已经变更：" + arg);
        }
    }
}
