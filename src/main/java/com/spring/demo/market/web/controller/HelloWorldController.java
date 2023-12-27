package com.spring.demo.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloWorldController {

    @GetMapping("/hola")
    public String sayHi(){
        return "Hello World";
    }
}
