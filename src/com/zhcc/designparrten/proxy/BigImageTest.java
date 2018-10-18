package com.zhcc.designparrten.proxy;

/**
 * Create by ZHCC on 2018/10/16
 */

public class BigImageTest {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Image img=new BigImage();
        Image image = new ImageProxy(img);
        System.out.println("系统得到Image时间开销" + (System.currentTimeMillis() - start));
        image.show();
    }
}
