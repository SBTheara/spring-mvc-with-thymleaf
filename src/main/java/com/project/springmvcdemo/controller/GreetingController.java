package com.project.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("name", "my heart will get out");
        return "index";
    }

}
