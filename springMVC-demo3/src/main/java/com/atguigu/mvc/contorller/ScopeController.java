package com.atguigu.mvc.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class ScopeController {


    //测试ModelAndView
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope","hello,ModelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    //测试向session中共享数据
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,Session");
        return "success";
    }
    //测试向application中共享数据
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope","hello application");
        return "success";
    }
    @RequestMapping(value = "/toSuccess",method = RequestMethod.PUT )
    public String toSuccess(){
        return "success";
    }


}
