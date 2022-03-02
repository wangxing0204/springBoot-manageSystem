package com.example.manage.mapper;
import com.example.manage.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAall();
}
