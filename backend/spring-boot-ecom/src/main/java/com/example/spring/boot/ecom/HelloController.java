package com.example.spring.boot.ecom;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @PostMapping("/post")
    public String post(@RequestBody String name) {
        return "Hello "+name;
    }
}
