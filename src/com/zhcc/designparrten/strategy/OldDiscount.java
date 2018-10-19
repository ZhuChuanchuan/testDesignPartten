package com.zhcc.designparrten.strategy;

/**
 * Create by ZHCC on 2018/10/18
 */

public class OldDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(double originPrice) {
        System.out.println("使用old打折...");
        return originPrice*0.7;
    }
}
