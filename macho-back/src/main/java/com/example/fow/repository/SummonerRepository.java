package com.example.fow.repository;

import com.example.fow.entity.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SummonerRepository extends JpaRepository<Summoner,String> {

    @Query("select s from  Summoner s where s.nickname= :nickname")
    List<Summoner> findAllByNickname(@Param("nickname")String nickname);
}
