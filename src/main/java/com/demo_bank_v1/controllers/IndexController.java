package com.demo_bank_v1.controllers;

import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getIndex(){
        ModelAndView getIndexPage = new ModelAndView("index");
        getIndexPage.addObject("PageTitle","Home");
        System.out.println("In Index Controller");
        return getIndexPage;
    }

    @GetMapping("/login")
    public ModelAndView getLogin(){
        ModelAndView getLoginPage = new ModelAndView("login");
        getLoginPage.addObject("PageTitle","Home");
        System.out.println("In Login Page Controller");
        return getLoginPage;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(){
        ModelAndView getRegisterPage = new ModelAndView("register");
        getRegisterPage.addObject("PageTitle","Home");
        System.out.println("In Register Page Controller");
        return getRegisterPage;
    }
}
