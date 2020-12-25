package com.jyyd.gate.service.impl;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.DbCarType;
import com.jyyd.gate.service.CarTypeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
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

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        String carStatus = "1";
        Result<Boolean> booleanResult = carTypeService.updateCarTypeByIds(list, carStatus);
        System.out.println(booleanResult);
    }
}