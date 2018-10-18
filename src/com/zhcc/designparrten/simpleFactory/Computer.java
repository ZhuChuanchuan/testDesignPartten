package com.zhcc.designparrten.simpleFactory;

/**
 * Create by ZHCC on 2018/10/16
 */

public class Computer {

    private Output out;

    public Computer(Output out) {
        this.out=out;
    }

    public void KeyIn(String msg) {
        out.getData(msg);
    }
    public void print(){
        out.out();
    }

    public static void main(String[] args) {
        OutputFactory of=new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.KeyIn("haha");
        c.KeyIn("hehe");
        c.print();
    }
}
