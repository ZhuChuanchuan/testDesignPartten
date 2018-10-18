package com.zhcc.designparrten.simpleFactory;

/**
 * Create by ZHCC on 2018/10/16
 */

public class Printer implements Output {

    private String[] printData = new String[MAX_CACHE_LINE];
    private int dataNum = 0;

    @Override
    public void out() {
        while (dataNum > 0) {
            System.out.println("打印机打印" +dataNum+":"+ printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE) {
            System.out.println("输出队列已满，添加失败");
        } else {
            printData[dataNum++] = msg;
        }
    }
}
