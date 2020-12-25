package com.jyyd.gate.dao;

import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.CorUser;
import com.jyyd.gate.pojo.DbPersonal;
import org.apache.ibatis.annotations.*;


/**
 * @Author:yangbiao
 * @Describe 查询用户
 * @Create 2020-12-25
 */
public interface UserMapper {

    /**
     * 查询用户及密码
     * @return  返回一个集合list
     */
    @Select("SELECT per.per_name,u.password   " +
            "from db_personal as per , cor_user as u where " +
            "per.per_id = u.per_id  and per.per_name = #{perName}")
    UserModel selectUser(@Param("perName") String perName);

    /*
     * 修改用户密码
     * */
    @Update("update cor_user set PASSWORD=#{passWord} where cor_user_id=#{id}")
    void updatePassword(@Param("passWord") String passWord,@Param("id") Long id);


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
    void insertUser(@Param("corUser") CorUser corUser);


}
