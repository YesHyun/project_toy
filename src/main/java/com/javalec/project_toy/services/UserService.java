package com.javalec.project_toy.services;

import com.javalec.project_toy.dto.User;
import com.javalec.project_toy.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;
    public UserService(UserMapper userMapper){this.userMapper=userMapper;}

    public List<User> getTest(){
        return userMapper.getTest();
    }
}
