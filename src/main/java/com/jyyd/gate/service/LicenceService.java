package com.jyyd.gate.service;

import com.jyyd.gate.model.LicenceModel;
import com.jyyd.gate.model.Result;

/**
 * @Author sagittal
 * @describe  车牌信息逻辑接口
 * @create 2020-12-25
 */
public interface LicenceService {
    /**
     * 登记车牌信息
     * @param licenceModel 目标信息
     * @return 返回接口
     */
    Result<Boolean> insertLicence(LicenceModel licenceModel);
}
