package com.aiguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControl {
    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){

        return "target";
    }

}
