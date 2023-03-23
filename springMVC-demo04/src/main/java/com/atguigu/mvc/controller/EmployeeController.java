package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.Employee;
import com.atguigu.mvc.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    //展示全部人员
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView getAllEmployee() {
        ModelAndView modelAndView = new ModelAndView();
        Collection<Employee> all = employeeDAO.getAll();
        modelAndView.addObject("employeeList", all);
        modelAndView.setViewName("employee_list");
        return modelAndView;
    }

}
