package com.gym.controllers;

import com.gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/login")
public class FirstController {


    private UserRepository userRepository;


    @RequestMapping(value = "/loginUser")
    public String loginUser(Model model)
    {
        userRepository = new UserRepository();
        userRepository.bla();
        model.addAttribute("user", "dan");
       return "welcome";
    }


}
