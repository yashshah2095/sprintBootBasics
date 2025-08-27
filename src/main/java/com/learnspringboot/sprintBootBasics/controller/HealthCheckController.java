package com.learnspringboot.sprintBootBasics.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @Value ("${owner.name}")
    private String ownerName;
    @GetMapping("health-check")
    public String getHealthCheck(){
        return "OK " + ownerName ;
    }
}
