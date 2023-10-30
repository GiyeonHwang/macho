package com.example.fow.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    private String id; // 아이디

    private String pw; // 비밀번호

    private String nickname; // 닉네임

    private String email; // 이메일

    private String phnum; // 전화 번호

    private String birth; // 생년월일

}
