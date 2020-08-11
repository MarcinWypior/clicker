package com.cbd.clicker.controllers;

import com.cbd.clicker.entities.User;
import com.cbd.clicker.interfaces.UserService;
import com.cbd.clicker.services.CurrentUser;
import com.cbd.clicker.services.EmailService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserService userService;
    private final EmailService emailService;

    public UserController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }


    @GetMapping("/registration")
    public String RegistrationGet(Model model){
        model.addAttribute("user",new User());
        return "user/registration";
    }

    @PostMapping("/registration")
    public String RegistrationPost(@Valid @ModelAttribute User user,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("user", user);
            return "user/registration";}
        else {
            userService.saveUser(user);
            emailService.sendSimpleMessage();
            model.addAttribute("message","link aktywacyjny wysłany na maila "+user.getEmail());
            return "user/login";
        }
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "user/login";
    }

}