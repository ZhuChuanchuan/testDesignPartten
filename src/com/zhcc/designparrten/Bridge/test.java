package com.zhcc.designparrten.Bridge;

/**
 * Create by ZHCC on 2018/10/19
 */

public class test {
    public static void main(String[] args) {
        //辣猪肉面 不辣猪肉面 辣牛肉面 不辣牛肉面
        AbstractNoodle noodle1 = new PorkNoodle(new PepperyStyle());
        noodle1.eat();
        AbstractNoodle noodle2 = new PorkNoodle(new PlainStyle());
        noodle2.eat();
        AbstractNoodle noodle3 = new BeefNoodle(new PepperyStyle());
        noodle3.eat();
        AbstractNoodle noodle4 = new BeefNoodle(new PlainStyle());
        noodle4.eat();
    }
}
