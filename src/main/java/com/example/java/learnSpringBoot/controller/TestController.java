package com.example.java.learnSpringBoot.controller;

import com.example.java.learnSpringBoot.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Rishi";
    }


    @GetMapping("/task")
    public Task getTask(){
        return new Task(1L, "Learn springboot", false );

    }
}
