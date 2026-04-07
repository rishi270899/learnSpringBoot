package com.example.java.learnSpringBoot.controller;

import com.example.java.learnSpringBoot.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Rishi";
    }


    @GetMapping("/task")
    public List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1l, "learnig spring boot", true));
        tasks.add(new Task(2l, "practice java", true));
        tasks.add(new Task(3l, "build project", false));
        return  tasks;
    }
}
