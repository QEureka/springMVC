package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class paramTest {
    @RequestMapping("/")
    public String param(){
        return "param_test";
    }
    @RequestMapping("/testparam")
    public String testparam(
            @RequestParam(value = "user_name") String username,String password){
        System.out.println(username+"---"+password);
        return "sussess";
    }
}
