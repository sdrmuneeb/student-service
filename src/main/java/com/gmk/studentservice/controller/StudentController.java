package com.gmk.studentservice.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class StudentController{

    public String welcome(){
        return String.join(",", "Welcome to ", "Student Service!");
    }


}
