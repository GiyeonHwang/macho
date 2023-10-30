package com.example.fow.controller;

import com.example.fow.entity.Summoner;
import com.example.fow.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @PostMapping("/summoner/info")
    public void info(Summoner summoner) {
        System.out.println(summoner.toString());
        summonerService.write(summoner);
    }

    @GetMapping("/pro/{nickname}")
    public List<Summoner> userInfo(@PathVariable(name ="nickname") String nickname) {

        List<Summoner> userInfo = summonerService.findUserInfo(nickname);
        System.out.println(userInfo.toString());

        return userInfo;
    }
}
