package com.jyyd.gate.service.impl;

import com.jyyd.gate.dao.LicenceMapper;
import com.jyyd.gate.model.LicenceModel;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.service.LicenceService;
import org.jetbrains.annotations.Contract;
import org.springframework.stereotype.Service;

/**
 * @Author sagittal
 * @describe 车牌逻辑实现类
 * @create 2020-12-25
 */
@Service
public class LicenceServiceImpl implements LicenceService {

    private final LicenceMapper licenceMapper;

    @Contract(pure = true)
    public LicenceServiceImpl(LicenceMapper licenceMapper) {
        this.licenceMapper = licenceMapper;
    }

    @Override
    public Result<Boolean> insertLicence(LicenceModel licenceModel) {
        /* 1. 查询用户是否存在 */


        return null;
    }
}
