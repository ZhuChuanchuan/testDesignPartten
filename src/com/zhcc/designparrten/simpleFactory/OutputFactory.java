package com.zhcc.designparrten.simpleFactory;

/**
 * Create by ZHCC on 2018/10/16
 */

public class OutputFactory {

    public Output getOutput(){
        return new BetterPrinter();
    }
}
