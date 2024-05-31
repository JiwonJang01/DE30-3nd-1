package com.example.letterapp.controller;

import com.example.letterapp.dto.UserRegisterDto;
import com.example.letterapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(Model model, UserRegisterDto userRegisterDto
                           ) {
        if (!userRegisterDto.getPassword().equals(userRegisterDto.getConfirmPassword())) {
            model.addAttribute("error", "Passwords do not match");
            return "register";
        }

        userService.registerUser(userRegisterDto.getNickname(), userRegisterDto.getPassword());
        return "redirect:/login";
    }
}
