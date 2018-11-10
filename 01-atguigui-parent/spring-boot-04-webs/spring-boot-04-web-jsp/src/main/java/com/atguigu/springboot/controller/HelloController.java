package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Chen
 * @created 2018-11-10-20:12.
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model) {
        model.addAttribute("msg", "你好");
        return "success";
    }
}
