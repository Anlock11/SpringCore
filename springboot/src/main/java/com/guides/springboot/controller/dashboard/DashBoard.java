package com.guides.springboot.controller.dashboard;

import com.guides.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("")
public class DashBoard {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("")
    public String index(Model model){
        return "index";

    }

    @GetMapping("/showusers")
    public String show(Model model){
    model.addAttribute("users",userService.getAllUsers());
    return "showusers";
    }
}
