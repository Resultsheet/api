package com.resultsheet.api.ResultSheetapi.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/classroom")
@CrossOrigin
public class Classroom {

    @GetMapping("/")
    public String getClassrooms(){
        return "Get all classrooms";
    }

    @PostMapping("/")
    public String saveClassroom(){
        return "Save a classroom";
    }

    @PutMapping("/")
    public String updateClassroom(){
        return "Update classroom";
    }

    @DeleteMapping("/")
    public String deleteClassroom (){
        return "Delete classroom";
    }

}
