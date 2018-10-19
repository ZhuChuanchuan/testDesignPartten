package com.zhcc.designparrten.strategy;

/**
 * Create by ZHCC on 2018/10/18
 */

public class DiscountContext {

    private DiscountStrategy strategy;

    public DiscountContext(DiscountStrategy strategy) {
        this.strategy=strategy;
    }

    public double getDiscountPrice(double price) {

        //默认选择
        if (strategy == null) {
            strategy=new OldDiscount();
        }
        return this.strategy.getDiscount(price);
    }

    public void changeDiscount(DiscountStrategy strategy) {
        this.strategy=strategy;
    }
}
