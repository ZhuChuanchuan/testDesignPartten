package com.zhcc.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Create by ZHCC on 2018/10/12
 */

public class EmailNotifier implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        //  处理EmailEvent事件
        if (applicationEvent instanceof EmailEvent) {
            EmailEvent evt=(EmailEvent)applicationEvent;
            System.out.println("地址" + evt.getAddress());
            System.out.println("正文"+evt.getText());
        }
    }
}
