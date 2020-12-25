package com.jyyd.gate.service.impl;

import com.jyyd.gate.common.enums.ResultStateEnums;
import com.jyyd.gate.dao.ChangePassWordMapper;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.CorUser;
import com.jyyd.gate.service.ChangePassWordService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
@Service
public class ChangePassWordServiceImpl implements ChangePassWordService {

    private final ChangePassWordMapper changePassWordMapper;

    public ChangePassWordServiceImpl(ChangePassWordMapper changePassWordMapper) {
        this.changePassWordMapper = changePassWordMapper;
    }

    @Override
    public Result<Boolean> changePassWord(String password,Long id) {
        changePassWordMapper.updatePassword(password,id);
        return Result.success(true, ResultStateEnums.CHANGE_SUCCESSFUL);
    }
}
