package com.klodnicki.bartolini.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homework {

    @GetMapping("/homework")

    public String homeworkGreeting(Model model) {
        model.addAttribute("text1", "so GREAT!");
        model.addAttribute("text2", "learn this special tool!");
        model.addAttribute("text3", "this works so fine!");
        return "homework";
    }
}
