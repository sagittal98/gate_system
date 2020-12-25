package com.jyyd.gate.service.impl;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.service.UserLoginService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
class UserLoginServiceImplTest {
    @Autowired
    private UserLoginService userLoginService;

    @Test
    void testSelectUser() {
        UserModel userModel = new UserModel("超级管理员", "123456");
        Result<UserModel> userModelResult = userLoginService.selectUser(userModel);
        System.out.println(userModelResult);
    }
}