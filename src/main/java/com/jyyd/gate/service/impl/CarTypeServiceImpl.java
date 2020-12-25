package com.jyyd.gate.service.impl;

import com.jyyd.gate.common.enums.ResultStateEnums;
import com.jyyd.gate.dao.CarTypeMapper;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.DbCarType;
import com.jyyd.gate.service.CarTypeService;
import org.jetbrains.annotations.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sagittal
 * @describe  车辆类型接口实现类
 * @create 2020-12-25
 */
@Service
public class CarTypeServiceImpl implements CarTypeService {

    private final CarTypeMapper carTypeMapper;

    @Contract(pure = true)
    public CarTypeServiceImpl(CarTypeMapper carTypeMapper) {
        this.carTypeMapper = carTypeMapper;
    }

    @Override
    public Result<List<DbCarType>> selectAllCarType() {
        List<DbCarType> dbCarTypes = carTypeMapper.selectAllCarType();
        System.out.println(dbCarTypes.size());
        return Result.success(dbCarTypes, ResultStateEnums.SUCCESS);
    }
}
