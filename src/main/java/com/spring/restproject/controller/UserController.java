package com.spring.restproject.controller;

import com.spring.restproject.model.request.UserDetailsRequestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(@RequestBody UserDetailsRequestModel userDetails){
    }
}
