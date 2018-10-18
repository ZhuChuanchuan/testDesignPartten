package com.zhcc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by ZHCC on 2018/10/9
 */

public class BeanTest {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = ctx.getBean("person", Person.class);
        p.useAxe();
    }
}
