package com.jyyd.gate.dao;

import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.CorUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
public interface ChangePassWordMapper {
    /*
     * 修改用户密码
     * */
    @Update("update cor_user set PASSWORD=#{passWord} where cor_user_id=#{id}")
    void updatePassword(@Param("passWord") String passWord,@Param("id") Long id);

}
