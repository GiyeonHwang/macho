package com.example.fow.entity.champEntity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "midchamp")
public class MidChamp {

    @Id
    @Column(name="rank")
    private Integer rank; // 등수

    @Column(name="champimg")
    private String champImg; // 이미지

    @Column(name="champion")
    private String champion; // 챔피언 이름

    @Column(name="tier")
    private Integer tier; // 티어

    @Column(name="winrate")
    private String winrate; // 승률

    @Column(name="pickrate")
    private String pickRate; // 픽률

    @Column(name="banrate")
    private String banRate; // 밴률

    @Column(name = "counter1")
    private String counter1; // 카운터 1

    @Column(name="counter2")
    private String counter2; // 카운터 2

    @Column(name = "counter3")
    private String counter3; // 카운터 3


}
