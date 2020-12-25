package com.jyyd.gate.dao;

import com.jyyd.gate.model.LicenceModel;

/**
 * @Author sagittal
 * @describe  车牌接口文档
 * @create 2020-12-25
 */
public interface LicenceMapper {
    /**
     * 登记车牌信息
     * @param licenceModel  目标信息
     */
    void insertLicence(LicenceModel licenceModel);
}
