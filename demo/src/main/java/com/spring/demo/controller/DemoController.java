package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping(value = {"/home", ""})
    public String demoControllerMethod(Model model) {
        return "home.html";
    }
}
