package com.jyyd.gate.dao;

import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.CorUser;
import com.jyyd.gate.pojo.DbPersonal;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
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
    @Select("SELECT u.cor_user_id,per.per_name,u.password,role.role_level   " +
            "from db_personal as per , cor_user as u , db_role as role where " +
            "per.per_id = u.per_id and u.role_id = role.role_id and per.per_name = #{perName}")
    UserModel selectUser(@Param("perName") String perName);


    /**
     * 写入人事信息
     * @param personal  目标人事
     */
    @Insert("insert into db_personal( " +
            "per_name,per_sex,per_birth,per_idcard,per_marriage,per_job_number,per_phone,per_special_phone,per_create_time" +
            " )" +
            "VALUES(" +
            "#{personal.perName}," +
            "#{personal.perSex}," +
            "#{personal.perBirth}," +
            "#{personal.perIdcard}," +
            "#{personal.perMarriage}," +
            "#{personal.perJobNumber}," +
            "#{personal.perPhone}," +
            "#{personal.perSpecialPhone}," +
            "#{personal.perCreateTime}" +
            ")")
    @Options(useGeneratedKeys = true,keyProperty = "personal.perId",keyColumn = "per_id")
    void insertPersonal(@Param("personal") DbPersonal personal);

    @Insert("insert into cor_user(" +
            "per_id,add_id" +
            ")" +
            " values (" +
            "#{corUser.perId}," +
            "#{corUser.addId}" +
            ")")
    @Options(useGeneratedKeys = true,keyProperty = "corUser.corUserId",keyColumn = "cor_user_id")
    void insertUser(@Param("corUser")CorUser corUser);


}
