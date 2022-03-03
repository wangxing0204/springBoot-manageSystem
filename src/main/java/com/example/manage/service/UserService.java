package com.example.manage.service;
import com.example.manage.pojo.User;
import java.util.List;

public interface UserService {

    List<User> findAll(User user);
}
