package com.atguigu.mvc.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    public String index(){
        System.out.println();
        return "index";
    }
}
