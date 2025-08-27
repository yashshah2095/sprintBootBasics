package com.learnspringboot.sprintBootBasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("health-check")
    public String getHealthCheck(){
        return "OK";
    }
}
