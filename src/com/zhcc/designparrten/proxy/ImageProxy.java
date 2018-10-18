package com.zhcc.designparrten.proxy;

/**
 * Create by ZHCC on 2018/10/16
 */

public class ImageProxy implements Image {

    //组合image实例
    private Image image;

    public ImageProxy(Image image) {
        this.image=image;
    }
    @Override
    public void show() {
        if (image == null) {
            image=new BigImage();
        }
        image.show();
    }
}
