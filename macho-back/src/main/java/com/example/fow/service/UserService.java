package com.example.fow.service;

import com.example.fow.entity.User;
import com.example.fow.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void userInsert(User user)
    {
        userRepository.save(user);
    }

    //해당 아이디 and 패스워드가 있는지 확인
    public User loginUser(String id,String pw)
    {
        User user = userRepository.searchByIdAndPw(id,pw);
        return user;
    }

    //해당 아이디가 있는지 확인
    public User registerCheckId(String id)
    {
        User user = userRepository.searchById(id);
        return user;
    }
    //해당 이메일이 있는지 확인
    public User registerCheckEmail(String email)
    {
        User user = userRepository.searchByEmail(email);
        return user;
    }
    //해당 닉네임이 있는지 확인
    public User registerCheckNickname(String nickname)
    {
        User user = userRepository.searchByNickname(nickname);
        return user;
    }

}
