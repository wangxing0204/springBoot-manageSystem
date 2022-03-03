package com.example.manage.controller;


import com.example.manage.pojo.Commodity;
import com.example.manage.pojo.User;
import com.example.manage.service.CommodityService;
import com.example.manage.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/products")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    /**
     * 新增
     * @param commodity
     * @return
     */
    @RequestMapping("/add")
    public Object addCommodity(Commodity commodity) {
        Object object = null;
        try {
            commodityService.addCommodity(commodity);
            object = ResultUtils.successResult(null, "新增成功！");
        } catch (Exception e) {
            e.printStackTrace();
            object = ResultUtils.errorResult();
        }
        return object;
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/get")
    public Object getCommodity() {
        List<Commodity> list = null;
        Object object = null;
        try {
            list=commodityService.getCommodity();
            object = ResultUtils.successResult(list, "查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            object = ResultUtils.errorResult();
        }
        return object;
    }

}
