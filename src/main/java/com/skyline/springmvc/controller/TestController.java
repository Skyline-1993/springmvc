package com.skyline.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangkepeng
 */
@Controller
public class TestController {

    @RequestMapping("/login")
    public String login() {
        System.out.println("Springmvc请求成功！");
        return "index";
    }
}
