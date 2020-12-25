package com.jyyd.gate.dao;

import com.jyyd.gate.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe 查询用户
 * @Create 2020-12-25
 */
public interface UserLoginMapper {

    /**
     * 查询用户及密码
     * @return  返回一个集合list
     */
    @Select("SELECT per.per_name,u.password   " +
            "from db_personal as per , cor_user as u where " +
            "per.per_id = u.per_id  and per.per_name = #{perName}")
    UserModel selectUser(@Param("perName") String perName);
}
