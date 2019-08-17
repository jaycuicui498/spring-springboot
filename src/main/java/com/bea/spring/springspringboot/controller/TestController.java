package com.bea.spring.springspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "result";
    }
}
