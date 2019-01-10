package com.warren.star.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        System.out.println( "hello world" );
        return "home";
    }

}
