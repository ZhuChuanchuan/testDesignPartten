package com.zhcc.designparrten.singleton;

/**
 * Create by ZHCC on 2018/10/16
 */

class Singleton{
    private static Singleton instance; //缓存曾经创建的实例

    private Singleton(){} //private隐藏构造器

    public static Singleton getInstance(){
        if (instance == null) {
            instance=new Singleton();
        }
        return  instance;
    }
}
public class SingletonTest {
    public static void main(String[] args) {

        //创建Singleton对象不能通过构造器，只能通过getInstance方法
        Singleton s1=Singleton.getInstance();

        Singleton s2=Singleton.getInstance();

        System.out.println(s1==s2);
    }
}
