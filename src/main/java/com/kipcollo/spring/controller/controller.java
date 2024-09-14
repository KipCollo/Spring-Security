package com.kipcollo.spring.controller;


import com.kipcollo.spring.service.SecurityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

@RequestMapping("/app")
 public class controller {

    private  SecurityService service;


    @GetMapping("/all")
    public String all(){
        return "all";

    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }
 }