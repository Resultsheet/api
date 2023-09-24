package com.resultsheet.api.ResultSheetapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/class")
@CrossOrigin

public class Class {

    @GetMapping("/")
    public String getUsers(){
        return "get all classes";
    }

}
