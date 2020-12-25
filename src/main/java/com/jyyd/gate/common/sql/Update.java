package com.jyyd.gate.common.sql;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

/**
 * @Author sagittal
 * @describe  修改语句
 * @create 2020-12-25
 */
public class Update {


    /**
     * 批量修改车辆类型状态
     * @param map  map集合
     * @return  返回sql语句
     */
    public String updateCarTypeByIds(@NotNull Map map){
        /* 类型id集合 */
        List carTypeIds = (List) map.get("carTypeIds");
        /* 修改状态 carStatus */
        String carStatus = (String) map.get("carStatus");

        System.out.println(carTypeIds);
        return "null";
    }
}
