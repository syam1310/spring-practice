package com.example.spring_boot_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //@GetMapping({"","/","home"})
    @RequestMapping({"","/","home"})
    public String home(Model model){
        model.addAttribute("username", "Syam Patel");
        return "home.html";
    }

}
