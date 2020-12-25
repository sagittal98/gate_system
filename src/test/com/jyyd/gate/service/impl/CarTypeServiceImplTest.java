package com.jyyd.gate.service.impl;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.DbCarType;
import com.jyyd.gate.service.CarTypeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;


/**
 * @Author sagittal
 * @describe  测试类
 * @create 2020-12-25
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
class CarTypeServiceImplTest {

    @Autowired
    private CarTypeService carTypeService;

    @Test
    void selectAllCarType() {

        Result<List<DbCarType>> listResult = carTypeService.selectAllCarType();
        System.out.println(listResult);

    }
}