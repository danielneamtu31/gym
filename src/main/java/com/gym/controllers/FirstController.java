package com.gym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class FirstController {

    @RequestMapping(value = "/loginUser")
    public String loginUser() {
        return "welcome";
    }
}
