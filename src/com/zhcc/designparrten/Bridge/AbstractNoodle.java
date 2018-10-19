package com.zhcc.designparrten.Bridge;

/**
 * Create by ZHCC on 2018/10/19
 */

public abstract class AbstractNoodle {
    protected Peppery style;

    public AbstractNoodle(Peppery style) {
        this.style=style;
    }
    public abstract void eat();
}
