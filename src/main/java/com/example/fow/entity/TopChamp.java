package com.example.fow.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "topchamp")
public class TopChamp {

    @Id
    private Integer rank; // 등수
    private String champImg; // 이미지
    private String champion; // 챔피언 읾
    private Integer tier; // 티어
    private String winRate; // 승률
    private String banRate; // 밴률
    private String counter1; // 카운터 1
    private String counter2; // 카운터 2
    private String counter3; // 카운터 3
}
