package com.dudu.chapter2;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Chen
 * @created 2018-10-22-11:48.
 */
@ConfigurationProperties(prefix = "com.dudu")
public class A_ConfigBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
