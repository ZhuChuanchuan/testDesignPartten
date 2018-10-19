package com.zhcc.designparrten.strategy;

/**
 * Create by ZHCC on 2018/10/18
 */

public class VipDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double originPrice) {
        System.out.println("使用VIP打折...");
        return originPrice*0.5;
    }
}
