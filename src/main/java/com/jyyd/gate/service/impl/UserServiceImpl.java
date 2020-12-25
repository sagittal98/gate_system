package com.jyyd.gate.service.impl;

import com.jyyd.gate.common.enums.ResultStateEnums;
import com.jyyd.gate.dao.AddressMapper;
import com.jyyd.gate.dao.UserMapper;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.CorUser;
import com.jyyd.gate.pojo.DbAddress;
import com.jyyd.gate.pojo.DbPersonal;
import com.jyyd.gate.service.UserService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final AddressMapper addressMapper;

    @Contract(pure = true)
    public UserServiceImpl(UserMapper userMapper, AddressMapper addressMapper) {
        this.userMapper = userMapper;
        this.addressMapper = addressMapper;
    }

    /*
    * 用户登陆
    * */
    @Override
    public Result<UserModel> selectUser(@NotNull UserModel userModel) {
        /* 登陆操作
        *  1. 能从前端获取账户和密码
        *  2. 先判断用户是否存在？ 查询的结果要包含密码
        *  3. 如果存在，就判断密码是否匹配
        *  */
        UserModel getUser = userMapper.selectUser(userModel.getPerName());
        System.out.println(getUser);
        if (getUser == null){
            // 用户为空，不存在
            return Result.success(null,ResultStateEnums.ACCOUNT_NOT_EXIST);
        }else {
            // 用户不为空
            if (userModel.getPassWord().equals(getUser.getPassWord())){
                // 如果为真  用户密码都正确
                return Result.success(getUser,ResultStateEnums.LOGIN_SUCCESSFUL);
            }else {
                // 如果为假 密码错误
                return Result.success(null,ResultStateEnums.ACCOUNT_PASSWORD_WRONG);
            }
        }
    }


    /*
    * 修改密码
    * */
    @Override
    public Result<Boolean> updatePassWord(String passWord, Long id) {
        userMapper.updatePassword(passWord,id);
        return Result.success(true, ResultStateEnums.CHANGE_SUCCESSFUL);
    }


    /*
    * 用户注册
    * */
    @Override
    public Result<Boolean> insertUser(DbPersonal personal, DbAddress address) {
        /*  注册用户流程 */
        // 1. 先插入用户数据
        userMapper.insertPersonal(personal);
        Long perId = personal.getPerId();
        // 2. 如果地址存在，插入家庭地址
        addressMapper.insertAddress(address);
        Long addId = address.getAddId();
        // 3. 将用户和地址进行关联
        CorUser corUser = new CorUser(perId,addId);
        userMapper.insertUser(corUser);
        Long userId = corUser.getCorUserId();
        System.out.println(perId + addId + userId);
        return Result.success(true,ResultStateEnums.ACCOUNT_REGISTER_SUCCESSFUL);
    }
}
