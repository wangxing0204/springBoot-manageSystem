package com.example.manage.service.impl;

import com.example.manage.mapper.CommodityMapper;
import com.example.manage.pojo.Commodity;
import com.example.manage.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public void addCommodity(Commodity commodity) {
        commodityMapper.addCommodity(commodity);
    }

    @Override
    public List<Commodity> getCommodity() {
        return commodityMapper.getCommodity();
    }

}
