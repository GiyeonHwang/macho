package com.example.fow.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "summoner")
@ToString
public class Summoner {

    @Id
    @Column(name="matchid")
    private String matchid;

    @Column(name="nickname")
    private String nickname;

    @Column(name = "kills")
    private Integer kills;

    @Column(name = "death")
    private Integer death;

    @Column(name = "assist")
    private Integer assist;

    @Column(name = "killrate")
    private Integer killrate;

    @Column(name = "cs")
    private Integer cs;

    @Column(name = "damage")
    private Integer damage;

    @Column(name = "champion")
    private String champion;

    @Column(name = "gametime")
    private double gametime;
}
