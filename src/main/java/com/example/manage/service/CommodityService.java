package com.example.manage.service;

import com.example.manage.pojo.Commodity;

import java.util.List;

public interface CommodityService {
    void addCommodity(Commodity commodity);
    List<Commodity> getCommodity();
}
