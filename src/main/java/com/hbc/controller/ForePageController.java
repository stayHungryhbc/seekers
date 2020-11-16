package com.hbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//用于界面的跳转
@Controller
public class ForePageController {
    @GetMapping("")
    public String index(){
        return "/fore/homePage";
    }
    @GetMapping("/home")
    public String home(){
        return "/fore/homePage";
    }
    @GetMapping("/register")
    public String registerPage(){
        return "/fore/register";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "/fore/login";
    }

}
