package com.example.fow.controller;

import com.example.fow.entity.TopChamp;
import com.example.fow.service.ChampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ranking")
public class ChampController {

    @Autowired
    private ChampService champService;

    @GetMapping("/top")
    public String topChampList(Model model, Pageable pageable)
    {
        Page<TopChamp> topList = null;

        topList = champService.TopChampChampList(pageable);

        model.addAttribute("topList", topList);

        return "toplist";
    }
}
