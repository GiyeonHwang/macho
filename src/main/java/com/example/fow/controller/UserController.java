package com.example.fow.controller;

import com.example.fow.entity.User;
import com.example.fow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fow")
public class UserController {

    @Autowired
    UserService userService;

    //회원 가입
    @PostMapping("/join")
    public void userRegister(User user)
    {
        userService.userInsert(user);
    }

    //로그인 체크
    @PostMapping("/login")
    public boolean userLogin(User user)
    {
        System.out.println("user = " +user);
        User controlUser = userService.loginUser(user.getId(),user.getPw());
        if(controlUser != null)
        {
            return true;
        }
        return false;
    }

    //회원가입 아이디 체크
    @PostMapping("/checkId")
    public boolean checkId(User user)
    {
        System.out.println("user = " +user);
        User checkId = userService.registerCheckId(user.getId());
        if(checkId != null)
        {
            return true;
        }
        return false;
    }
    //회원가입 이메일 체크
    @PostMapping("/checkEmail")
    public boolean checkEmail(User user)
    {
        System.out.println("user = " +user);
        User checkEmail = userService.registerCheckEmail(user.getEmail());
        if(checkEmail != null)
        {
            return true;
        }
        return false;
    }
    //회원가입 닉네임 체크
    @PostMapping("/checkNickname")
    public boolean checkNickname(User user)
    {
        System.out.println("user = " +user);
        User checkNickname = userService.registerCheckNickname(user.getNickname());
        if(checkNickname != null)
        {
            return true;
        }
        return false;
    }
}
