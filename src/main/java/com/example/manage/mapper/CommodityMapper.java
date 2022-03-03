package com.example.manage.mapper;

import com.example.manage.pojo.Commodity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityMapper {

    @Insert("insert into commodity(name,price) values(#{name},#{price})")
    void addCommodity(Commodity commodity);

    @Select("select * from commodity")
    List<Commodity> getCommodity();
}
