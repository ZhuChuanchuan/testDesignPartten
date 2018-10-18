package com.zhcc.designparrten.command;

/**
 * Create by ZHCC on 2018/10/18
 */

public class ProcessArray {
    public void each(int[] target,Command cmd) {
        cmd.process(target);
    }
}
