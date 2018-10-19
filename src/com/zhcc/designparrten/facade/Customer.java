package com.zhcc.designparrten.facade;

/**
 * Create by ZHCC on 2018/10/18
 */

public class Customer {
    public void haveDinner(){
        Payment pay=new PaymentImpl();
        Cook cook=new CookImpl();
        Waiter waiter=new WaiterImpl();

        String food=pay.pay();
        food = cook.cook(food);
        waiter.serve(food);

        //门面模式
        Facade f=new Facade();
        f.ServeFood();
    }
}
