package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {
    User user = new User("Hi, this is sairam Welcome to stackroute!!");
    @RequestMapping(value = "/")
    public String greeting(Model map) {
        map.addAttribute("greeting", user.getUser());
        return "index";
    }
}
