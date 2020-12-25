package com.jyyd.gate.common.sql;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.Map;

/**
 * @Author sagittal
 * @describe 修改语句
 * @create 2020-12-25
 */
public class Update {


    /**
     * 批量修改车辆类型状态
     *
     * @param map map集合
     * @return 返回sql语句
     */
    public String updateCarTypeByIds(@NotNull Map map) {
        /* 类型id集合 */
        List carTypeIds = (List) map.get("carTypeIds");
        /* 修改状态 carStatus */
        String carStatus = (String) map.get("carStatus");
        /* 创建sql语句 */
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE db_car_type SET car_type_status = '").append(carStatus).append("' WHERE car_type_id IN (");

        /* 修改id存在 */
        if (carTypeIds.size() != 0) {
            for (Object o : carTypeIds) {
                sql.append(o).append(",");
            }
            sql.delete(sql.length()-1,sql.length());
        }
        sql.append(")");

        return String.valueOf(sql);
    }
}
