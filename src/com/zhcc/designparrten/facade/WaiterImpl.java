package com.zhcc.designparrten.facade;

/**
 * Create by ZHCC on 2018/10/18
 */

public class WaiterImpl implements Waiter {
    @Override
    public void serve(String fodd) {
        System.out.println("上菜了");
    }
}
