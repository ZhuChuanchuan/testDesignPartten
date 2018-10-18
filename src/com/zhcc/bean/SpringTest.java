package com.zhcc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by ZHCC on 2018/10/12
 */

public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmailEvent evt = new EmailEvent("test", "jfsdaf@142.com", "haha");
        ctx.publishEvent(evt);

        System.out.println(ctx.getBean("p1") == ctx.getBean("p1"));
        System.out.println(ctx.getBean("p2") == ctx.getBean("p2"));
    }
}
