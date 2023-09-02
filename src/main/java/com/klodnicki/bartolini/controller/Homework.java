package com.klodnicki.bartolini.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homework {

    @Value("${textA}")
    String text1;
    @Value("${textB}")
    String text2;
    @Value("${textC}")
    String text3;

    @GetMapping("/homework")

    public String homeworkGreeting(Model model) {
        model.addAttribute("text1", text1);
        model.addAttribute("text2", text2);
        model.addAttribute("text3", text3);
        return "homework";
    }
}
