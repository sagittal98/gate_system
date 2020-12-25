package com.jyyd.gate.service.impl;

import com.jyyd.gate.common.enums.ResultStateEnums;
import com.jyyd.gate.dao.UserLoginMapper;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    private final UserLoginMapper userLoginMapper;

    public UserLoginServiceImpl(UserLoginMapper userLoginMapper) {
        this.userLoginMapper = userLoginMapper;
    }

    @Override
    public Result<Boolean> selectUser(UserModel userModel) {
        /* 登陆操作
        *  1. 能从前端获取账户和密码
        *  2. 先判断用户是否存在？ 查询的结果要包含密码
        *  3. 如果存在，就判断密码是否匹配
        *  */
        UserModel getUser = userLoginMapper.selectUser(userModel.getPerName());
        System.out.println(getUser);
        if (getUser == null){
            // 用户为空，不存在
            return Result.success(null,ResultStateEnums.ACCOUNT_NOT_EXIST);
        }else {
            // 用户不为空
            if (userModel.getPassWord().equals(getUser.getPassWord())){
                // 如果为真  用户密码都正确
                return Result.success(true,ResultStateEnums.LOGIN_SUCCESSFUL);
            }else {
                // 如果为假 密码错误
                return Result.success(false,ResultStateEnums.ACCOUNT_PASSWORD_WRONG);
            }
        }
    }
}
