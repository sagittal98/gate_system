package com.jyyd.gate.service;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.DbAddress;
import com.jyyd.gate.pojo.DbPersonal;


/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
public interface UserService {
    /*
    * 查询用户是否存在
    * @Return 一个User对象
    * */
    Result<UserModel> selectUser(UserModel userModel);

    /*
    * 修改用户密码
    * */
    Result<Boolean> updatePassWord(String passWord,Long corUserId);

    /**
     * 注册用户
     * @param personal  目标人物
     * @param address 目标地址
     * @return 返回结果
     */
    Result<Boolean> insertUser(DbPersonal personal, DbAddress address);
}
