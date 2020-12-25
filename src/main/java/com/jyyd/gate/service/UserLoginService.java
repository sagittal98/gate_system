package com.jyyd.gate.service;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.DbAddress;
import com.jyyd.gate.pojo.DbPersonal;

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
    Result<UserModel> selectUser(UserModel userModel);

    /**
     * 注册用户
     * @param personal  目标人物
     * @param address 目标地址
     * @return 返回结果
     */
    Result<Boolean> insertUser(DbPersonal personal, DbAddress address);
}
