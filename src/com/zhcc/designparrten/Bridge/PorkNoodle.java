package com.zhcc.designparrten.Bridge;

/**
 * Create by ZHCC on 2018/10/19
 */

public class PorkNoodle extends AbstractNoodle {
    public PorkNoodle(Peppery style) {
        super(style);
    }

    @Override
    public void eat() {
        System.out.println("猪肉面"+super.style.style());
    }
}
