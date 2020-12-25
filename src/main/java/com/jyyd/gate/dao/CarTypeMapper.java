package com.jyyd.gate.dao;

import com.jyyd.gate.pojo.DbCarType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @Author sagittal
 * @describe 车辆类型接口文档
 * @create 2020-12-25
 */
public interface CarTypeMapper {

    /**
     * 查询车辆所有的类型
     * @return  返回集合list
     */
    @Select("SELECT * FROM db_car_type")
    List<DbCarType> selectAllCarType();

    /**
     *  通过cardIds集合 修改车辆类型状态
     * @param carTypeIds  目标id
     * @param carStatus  修改状态
     */
    @UpdateProvider(type = com.jyyd.gate.common.sql.Update.class,method = "updateCarTypeByIds")
    void updateCarTypeByIds(@Param("carTypeIds") List<Integer> carTypeIds,@Param("carStatus") String carStatus);

}
