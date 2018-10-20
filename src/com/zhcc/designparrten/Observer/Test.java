package com.zhcc.designparrten.Observer;

/**
 * Create by ZHCC on 2018/10/19
 */

public class Test {
    public static void main(String[] args) {
        Product p = new Product("电视机", 132);
        NameObserver no=new NameObserver();
        PriceObserver po=new PriceObserver();

        p.registObserver(no);
        p.registObserver(po);

        p.setName("书桌");
        p.setPrice(32.2);
    }
}
