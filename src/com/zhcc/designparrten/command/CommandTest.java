package com.zhcc.designparrten.command;

/**
 * Create by ZHCC on 2018/10/18
 */

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa=new ProcessArray();
        int[] target = {3, 6, -1, 4};
        pa.each(target, new Command() {
            @Override
            public void process(int[] target) {
                for (int tmp : target) {
                    System.out.println("元素"+tmp);
                }
            }
        });
        System.out.println("-----------------");
        pa.each(target, new Command() {
            @Override
            public void process(int[] target) {
                int sum=0;
                for (int tmp : target) {
                    sum+=tmp;
                }
                System.out.println("和为"+sum);
            }
        });

        pa.each(target,array->{
            int sum=0;
            for (int tmp : array) {
                sum+=tmp;
            }
            System.out.println(sum);
        });
    }
}
