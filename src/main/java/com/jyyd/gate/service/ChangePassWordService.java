package com.jyyd.gate.service;

import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.CorUser;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
public interface ChangePassWordService {
    Result<Boolean> updatePassWord(String passWord,Long id);
}
