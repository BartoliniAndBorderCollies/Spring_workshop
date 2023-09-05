package com.klodnicki.bartolini.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @Value("${author.name}")
    String myName;

    @GetMapping("/home")
    public String home(Model model) {
        // zapytanie do serwisu i do bazy danych o imię jakies losowe
        model.addAttribute("myName", myName);
        return "home";
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";

    }
}
