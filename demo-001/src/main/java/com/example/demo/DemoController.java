package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello, Quick Kube Console Log!");
        return "Hello, Quick Kube!";
    }
}
