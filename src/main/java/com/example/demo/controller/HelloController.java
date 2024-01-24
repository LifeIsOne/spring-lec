package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    public HelloController(){
        System.out.println("HelloController 컴포넌트 스캔됨");
    }

    @GetMapping("/hello")
    public void home(){
        System.out.println("home 호출됨");
    }

    @GetMapping("/random")
    public String hello(){
        Random r = new Random();
        int num = r.nextInt(5)+1;
        return "<h1>Random"+num+"</h>";
    }
}
