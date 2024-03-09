package com.bmr.bancamifelrequirement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlle {

    public HelloControlle() {
        super();
        //TODO Auto-generated constructor stub
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
