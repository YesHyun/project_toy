package com.javalec.project_toy.controller;

import com.javalec.project_toy.dto.User;
import com.javalec.project_toy.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @RequestMapping("/test")
    public String getTest(Model model){
        List<User> user = this.userService.getTest();
        model.addAttribute("test", user);
        System.out.println(user.toString());
        return "/userTest";
    }

}
