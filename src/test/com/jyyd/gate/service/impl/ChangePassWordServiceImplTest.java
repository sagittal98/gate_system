package com.jyyd.gate.service.impl;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.CorUser;
import com.jyyd.gate.service.ChangePassWordService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
class ChangePassWordServiceImplTest {

    @Autowired
    private ChangePassWordService changePassWordService;

    @Test
    void testChangePassWord(){
        Result<Boolean> booleanResult = changePassWordService.changePassWord("123456",1L);
        System.out.println(booleanResult);
    }

}