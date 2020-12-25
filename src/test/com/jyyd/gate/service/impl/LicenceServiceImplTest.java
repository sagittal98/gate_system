package com.jyyd.gate.service.impl;

import com.jyyd.gate.model.LicenceModel;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.pojo.DbAddress;
import com.jyyd.gate.service.LicenceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author sagittal
 * @describe
 * @create 2020-12-25
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
class LicenceServiceImplTest {
    @Autowired
    private LicenceService licenceService;

    @Test
    void insertLicence() {
        LicenceModel licenceModel = new LicenceModel();
        licenceModel.setAddress("[中国,四川,巴中,凤溪乡元盘村十二组七社]");
        licenceModel.setPerName("sagittal");
        licenceModel.setCarTypeId(1L);
        licenceModel.setCarModelId(5L);
        licenceModel.setLicNumber("川A555555");
        licenceModel.setLicStartDate(new Date(System.currentTimeMillis()));
        licenceModel.setLicEndDate(new Date(System.currentTimeMillis()));
        System.out.println(licenceModel);
        Result<Boolean> booleanResult = licenceService.insertLicence(licenceModel);
        System.out.println(booleanResult);
    }
}