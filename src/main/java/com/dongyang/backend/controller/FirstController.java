package com.dongyang.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/")
    public String firstPage() {
        return "index";
    }

    @GetMapping("/hi")
    public String hello(Model model) {
        model.addAttribute("userName", "주천수");
        return "hi";
    }
}
