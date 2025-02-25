package com.finac.sports.tennis.app.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("name", "Vijay");
        return "index";
    }
}
