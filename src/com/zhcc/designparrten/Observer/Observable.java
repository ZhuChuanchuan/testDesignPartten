package com.zhcc.designparrten.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ZHCC on 2018/10/19
 */

public abstract class Observable {
    List<Observer> observersList = new ArrayList<>();

    public void registObserver(Observer o) {
        observersList.add(o);
    }
    public void removeObserver(Observer o) {
        observersList.remove(o);
    }

    //通知改主题上注册的所有观察者
    public void notifyObservers(Object value) {
        for (Observer o : observersList) {
            o.update(this, value);
        }
    }
}
