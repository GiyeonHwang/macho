package com.example.fow.controller;

import com.example.fow.entity.Summoner;
import com.example.fow.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summoner")
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @PostMapping("/info")
    public void info(Summoner summoner) {
        System.out.println(summoner.toString());
        summonerService.write(summoner);
    }
}
