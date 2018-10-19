package com.zhcc.designparrten.Bridge;

/**
 * Create by ZHCC on 2018/10/19
 */

public class BeefNoodle extends AbstractNoodle {
    public BeefNoodle(Peppery style) {
        super(style);
    }

    @Override
    public void eat() {
        System.out.println("牛肉面"+super.style.style());
    }
}
