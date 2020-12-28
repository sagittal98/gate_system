package com.jyyd.gate.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baidubce.services.cdn.model.JsonObject;
import com.jyyd.gate.common.regular.RegUtils;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.DbCarType;
import com.jyyd.gate.service.CarTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-28
 */
@Controller
@RequestMapping(value = "/carType/",method = RequestMethod.POST)
public class CarTypeController {

    private final CarTypeService carTypeService;

    public CarTypeController(CarTypeService carTypeService) {
        this.carTypeService = carTypeService;
    }

    /*
    * 查询所有车辆类别
    * */
    @RequestMapping("carType")
    @ResponseBody
    Result<List<DbCarType>> selectAllCarType(@RequestBody JSONObject req) throws Exception {
        return carTypeService.selectAllCarType();
    }

    /*
    * 修改车辆类型状态
    * */
    @RequestMapping("upDateCarTypeIds")
    @ResponseBody
    Result<Boolean> updateCarTypeByIds(@RequestBody JSONObject req){
//        List<Integer> carTypeIds,String carStatus
        String carTypeIdsStr = req.getString("carTypeIds");
        String substring = carTypeIdsStr.substring(1, carTypeIdsStr.length() - 1);
        String[] split = substring.split(",");
        ArrayList<Integer> integers = new ArrayList<>();
        for (String s : split){
            integers.add(Integer.valueOf(s));
        }
        System.out.println(integers);
        String carStatus = req.getString("carStatus");
        return carTypeService.updateCarTypeByIds(integers,carStatus);
    }



}
