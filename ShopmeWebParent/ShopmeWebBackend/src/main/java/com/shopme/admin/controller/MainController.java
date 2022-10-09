package com.shopme.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(path = "")
    public String status(){
        return "App is up and running";
    }
}
