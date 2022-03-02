package com.example.manage.service.impl;

import com.example.manage.mapper.UserMapper;
import com.example.manage.pojo.User;
import com.example.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAall();
    }
}
