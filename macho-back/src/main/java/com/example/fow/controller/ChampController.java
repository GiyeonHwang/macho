package com.example.fow.controller;

import com.example.fow.entity.champEntity.*;
import com.example.fow.service.ChampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ranking")
public class ChampController {

    @Autowired
    private ChampService champService;

    @GetMapping("/")
    public Page<TopChamp> topChampList(@PageableDefault(size = 100) Pageable pageable)
    {
        Page<TopChamp> topList = null;

        topList = champService.TopChampList(pageable);
        return topList;
    }

    @GetMapping("/jungle")
    public Page<JungleChamp> JungleChampList(@PageableDefault(size = 100) Pageable pageable)
    {
        Page<JungleChamp> jungleList = null;

        jungleList = champService.JungleChampList(pageable);
        return jungleList;
    }
    @GetMapping("/mid")
    public Page<MidChamp> MidChampList(@PageableDefault(size = 100) Pageable pageable)
    {
        Page<MidChamp> midList = null;

        midList = champService.MidChampList(pageable);
        return midList;
    }

    @GetMapping("/bottom")
    public Page<BottomChamp> BottomChampList(@PageableDefault(size = 100) Pageable pageable)
    {
        Page<BottomChamp> bottomList = null;

        bottomList = champService.BottomChampList(pageable);
        return bottomList;
    }

    @GetMapping("/support")
    public Page<SupportChamp> SupportChampList(@PageableDefault(size = 100) Pageable pageable)
    {
        Page<SupportChamp> supportList = null;

        supportList = champService.SupportChampList(pageable);
        return supportList;
    }
}
