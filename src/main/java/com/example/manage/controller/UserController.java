package com.example.manage.controller;

import com.example.manage.pojo.User;
import com.example.manage.service.UserService;
import com.example.manage.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/manager_login")
    public Object findAll(User user) {
        List<User> all = null;
        Object object = null;
        try {
            all = userService.findAll(user);
            object = ResultUtils.successResult(all,"登录成功！");
        } catch (Exception e) {
            e.printStackTrace();
            object = ResultUtils.errorResult();
        }
        return object;
    }


}
