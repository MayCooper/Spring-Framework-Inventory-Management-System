package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainscreenController {

    @GetMapping("/about")
    public String showAboutPage() {
        return "about";
    }
}