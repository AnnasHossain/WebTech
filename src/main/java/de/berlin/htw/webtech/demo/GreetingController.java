package com.example.restservice;

import org.spring.framerwork.web.bind.annotation.GetMapping;



@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name){
        return "hello " + name;
    }
    
}
