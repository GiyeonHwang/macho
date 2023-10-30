package com.example.fow.service;

import com.example.fow.entity.Summoner;
import com.example.fow.repository.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummonerService {

    @Autowired
    private SummonerRepository summonerRepository;

    public void write(Summoner summoner) {
        summonerRepository.save(summoner);
    }

    public List<Summoner> findUserInfo(String nickname){
        return summonerRepository.findAllByNickname(nickname);
    }
}
