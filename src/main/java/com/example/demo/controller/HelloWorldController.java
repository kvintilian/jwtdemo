package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
