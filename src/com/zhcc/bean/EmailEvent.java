package com.zhcc.bean;

import org.springframework.context.ApplicationEvent;

/**
 * Create by ZHCC on 2018/10/12
 */

public class EmailEvent extends ApplicationEvent {

    private String address;
    private String text;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address=address;
        this.text=text;
    }
}
