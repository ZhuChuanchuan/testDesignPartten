package com.zhcc.designparrten.facade;

/**
 * Create by ZHCC on 2018/10/19
 */

public class Facade {
    Payment pay;
    Cook cook;
    Waiter waiter;

    public Facade(){
        this.pay=new PaymentImpl();
        this.cook=new CookImpl();
        this.waiter=new WaiterImpl();
    }
    public void ServeFood() {
        String food=pay.pay();
        food = cook.cook(food);
        waiter.serve(food);
    }
}
