package com.example.fow.repository;

import com.example.fow.entity.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerRepository extends JpaRepository<Summoner,String> {
}
