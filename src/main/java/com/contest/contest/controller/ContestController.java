package com.contest.contest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ContestController {
    @GetMapping("/get")
    public String getMethodName() {
        return new String("hello");
    }
    
}
