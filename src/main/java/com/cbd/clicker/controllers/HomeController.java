package com.cbd.clicker.controllers;


import com.cbd.clicker.entities.User;
import com.cbd.clicker.reposititories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class HomeController {

    private UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

}