package com.zhcc.designparrten.simpleFactory;

/**
 * Create by ZHCC on 2018/10/16
 */

public interface Output {

    int MAX_CACHE_LINE = 50;

    void out();

    void getData(String msg);
}
