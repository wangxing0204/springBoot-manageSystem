package com.example.manage.mapper;

import com.example.manage.pojo.Commodity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityMapper {

    @Insert("insert into commodity(name,price,thumbnail) values(#{name},#{price},#{thumbnail})")
    void addCommodity(Commodity commodity);

    @Select("select * from commodity")
    List<Commodity> getCommodity();

    @Delete("delete from commodity where id=#{id}")
    int deleteCommodity(Integer id);

    @Select("select * from commodity where name like concat('%',#{search},'%')")
    List<Commodity> commodityPageInfo(String search);
}
