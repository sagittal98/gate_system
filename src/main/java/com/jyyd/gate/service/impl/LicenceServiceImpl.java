package com.jyyd.gate.service.impl;

import com.jyyd.gate.common.enums.ResultStateEnums;
import com.jyyd.gate.dao.AddressMapper;
import com.jyyd.gate.dao.LicenceMapper;
import com.jyyd.gate.dao.UserMapper;
import com.jyyd.gate.model.LicenceModel;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.CorUser;
import com.jyyd.gate.pojo.DbAddress;
import com.jyyd.gate.pojo.DbPersonal;
import com.jyyd.gate.service.LicenceService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sagittal
 * @describe 车牌逻辑实现类
 * @create 2020-12-25
 */
@Service
public class LicenceServiceImpl implements LicenceService {

    private final LicenceMapper licenceMapper;
    private final AddressMapper addressMapper;
    private final UserMapper userMapper;

    @Contract(pure = true)
    public LicenceServiceImpl(LicenceMapper licenceMapper, AddressMapper addressMapper, UserMapper userMapper) {
        this.licenceMapper = licenceMapper;
        this.addressMapper = addressMapper;
        this.userMapper = userMapper;
    }

    @Override
    public Result<Boolean> insertLicence(@NotNull LicenceModel licenceModel) {
        /* 1. 查询用户是否存在 */
        UserModel userModel = userMapper.selectUser(licenceModel.getPerName());
        if (userModel == null) {
            // 用户不存在，需要注册
            /* 2. 用户存在，因此需要注册 */
            DbPersonal dbPersonal = new DbPersonal(licenceModel);
            DbAddress dbAddress = new DbAddress(licenceModel);
            userMapper.insertPersonal(dbPersonal);
            addressMapper.insertAddress(dbAddress);
            CorUser corUser = new CorUser(dbPersonal.getPerId(), dbAddress.getAddId());
            userMapper.insertUser(corUser);
            licenceModel.setCorUserId(corUser.getCorUserId());
            licenceMapper.insertLicence(licenceModel);
            return Result.success(true, ResultStateEnums.LICENCE_REGISTER_SUCCESSFUL);
        } else {
            // 用户存在，不需要注册,开始登记
            licenceMapper.insertLicence(licenceModel);
            return Result.success(true, ResultStateEnums.LICENCE_REGISTER_SUCCESSFUL);
        }
    }
}
