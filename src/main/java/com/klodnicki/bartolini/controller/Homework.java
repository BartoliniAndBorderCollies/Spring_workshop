package com.klodnicki.bartolini.controller;


import com.klodnicki.bartolini.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

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

        model.addAttribute("thisPutToHtml1", "Kolumna name");
        model.addAttribute("thisPutToHtml2", "Kolumna telefon");
        model.addAttribute("thisPutToHtml3", "Kolumna miasto");

        model.addAttribute("thisPutToHtml4", "Janek");
        model.addAttribute("thisPutToHtml5", "997");
        model.addAttribute("thisPutToHtml6", "Szczebrzeszyn");

        model.addAttribute("listParam1", "Coffee");
        model.addAttribute("listParam2", "Tea");
        model.addAttribute("listParam3", "Milk");
        model.addAttribute("listParam4", "Chips");
        model.addAttribute("listParam5", "Alcohol");
        model.addAttribute("listParam6", "Lollipop");

        boolean print = true;
        model.addAttribute("print", print);

        List<String> clothes = Arrays.asList("bra", "jeans", "sweater", "underwear", "shirt", "akaka");
        model.addAttribute("clothes", clothes);

        Person person = new Person("Lola", 23);
        model.addAttribute("person", person);


        return "homework";
    }
}
