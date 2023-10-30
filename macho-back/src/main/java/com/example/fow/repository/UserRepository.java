package com.example.fow.repository;

import com.example.fow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,String> {

    //
    @Query("select u from User u where u.id=:id and u.pw=:pw")
    User searchByIdAndPw(@Param("id")String id,@Param("pw")String pw);

    @Query("select u from User u where u.id=:id")
    User searchById(@Param("id")String id);

    @Query("select u from User u where u.email=:email")
    User searchByEmail(@Param("email")String email);

    @Query("select u from User u where u.nickname=:nickname")
    User searchByNickname(@Param("nickname")String nickname);
}

