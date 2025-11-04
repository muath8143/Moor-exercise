package com.example.moreexersice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/menu")
    public String menu(){
        return "This page is menu ";
    }

    @GetMapping("/menu/login")
    public String login(){
        String username="Please enter your user name or email: |-------------------| ";
        String pass="Please enter your password: |-------------------|";
        return username + pass;
    }

    @GetMapping("menu/signup")
    public String signup(){
        String name="Enter your name: |-------------------| ";
        String user="Enter Username: |-------------------|";
        String email="Enter your email: |-------------------| ";
        String password="Enter your password: |-------------------|";
        String checkpassword="Please enter your password again: |-------------------|";
        return name+user+email+password+checkpassword;
    }
}
