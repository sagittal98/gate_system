package com.jyyd.gate.service;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.DbCarType;

import java.util.List;

/**
 * @Author sagittal
 * @describe 卡车类型接口
 * @create 2020-12-25
 */
public interface CarTypeService {
    /**
     * 查询车辆所有的类型
     * @return 返回结果
     */
    Result<List<DbCarType>> selectAllCarType();

    /**
     * 通过cardIds集合 修改车辆类型状态
     * @param carTypeIds 目标id
     * @param carStatus 修改状态
     * @return  返回结果
     */
    Result<Boolean> updateCarTypeByIds( List<Integer> carTypeIds,String carStatus);



}
