package com.zhcc.designparrten.facade;

/**
 * Create by ZHCC on 2018/10/18
 */

public class PaymentImpl implements Payment {
    @Override
    public String pay() {
        String food="快餐";
        System.out.println("已支付");
        return food;
    }
}
