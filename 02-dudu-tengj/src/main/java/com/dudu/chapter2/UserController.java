package com.dudu.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen
 * @created 2018-10-22-11:42.
 */
@RestController
@RequestMapping("/chapter1")
public class UserController {

    @Value("${com.dudu.name}")
    private String name;
    @Value("${com.dudu.want}")
    private String want;
    @Value("${com.dudu.yearhope}")
    private String yearhope;

    @RequestMapping("/want")
    public String want() {
        return "value注解形式：" + name + "， " + want + "， " + yearhope;
    }

    @Autowired
    A_ConfigBean aConfigBean;

    @RequestMapping("/beanwant")
    public String beanwant() {
        return "bean注入形式：" + aConfigBean.getName() + "，" + aConfigBean.getWant();
    }

    @Autowired
    B_ConfigTestBean bConfigBean;

    @RequestMapping("/b_beanwant")
    public String b_beanwant() {
        return "b_bean不同配置文件：" + bConfigBean.getName() + "，" + bConfigBean.getWant();
    }
}
