package com.zhcc.designparrten.facade;

/**
 * Create by ZHCC on 2018/10/18
 */

public class CookImpl implements Cook {
    @Override
    public String cook(String food) {
        System.out.println("已烹饪好");
        return food;
    }
}
