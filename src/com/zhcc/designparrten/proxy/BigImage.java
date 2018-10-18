package com.zhcc.designparrten.proxy;

import static java.lang.Thread.*;

/**
 * Create by ZHCC on 2018/10/16
 */

public class BigImage implements Image {

    public BigImage(){
        try {
            sleep(3000);
            System.out.println("图片加载成功...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void show() {
        System.out.println("绘制图片");
    }
}
