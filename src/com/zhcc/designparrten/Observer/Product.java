package com.zhcc.designparrten.Observer;

/**
 * Create by ZHCC on 2018/10/19
 */

public class Product extends Observable {
    private String name;
    private double price;
    public Product(){

    }

    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name=name;
        notifyObservers(name);
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
        notifyObservers(price);
    }
}
