package com.example.fow.controller;

import com.example.fow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fow")
public class UserController {

    @Autowired
    UserService userService;
}
