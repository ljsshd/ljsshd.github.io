package com.ljs.dome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hellospringboot {
    @GetMapping("/index")
    public String hello() {
        return "index";
    }
}
