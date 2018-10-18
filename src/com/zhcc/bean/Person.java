package com.zhcc.bean;

/**
 * Create by ZHCC on 2018/10/9
 */

public class Person {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe=axe;
    }

    public void useAxe(){
        System.out.println("我打算去砍柴");
        System.out.println(axe.chop());
    }
}
