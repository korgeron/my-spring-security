package com.security.myspringsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "<h1>WELCOME TO THE HOME PAGE!</h1>" + "<a href='/hello' >Hello Page</a>";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloPage(){
        return "<h1>Hello World!</h1>";
    }
}
