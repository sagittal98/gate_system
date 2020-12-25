package com.jyyd.gate.service;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
public interface UserLoginService {

    /*
    * 查询用户是否存在
    * @Return 一个User对象
    * */
    Result<Boolean> selectUser(UserModel userModel);
}
