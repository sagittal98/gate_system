package com.jyyd.gate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author sagittal
 * @describe  车牌信息模型
 * @create 2020-12-25
 */
public class LicenceModel implements Serializable {
    // 车牌号
    private String licNumber;
    // 车辆类型
    private Long carTypeId;
    // 车辆型号
    private Long carModelId;
    // 有效起日
    private Date licStartDate;
    // 有效止日
    private Date licEndDate;
    // 车辆编号
    private String carNumber;
    // 人员姓名
    private String perName;
    // 手机号码
    private String perPhone;
    // 家庭住址
    private String address;
    // 用户id
    private Long corUserId;
    // 车辆备注
    private String carRemark;

    @Override
    public String toString() {
        return "{" + "\"licNumber\":\"" +
                licNumber + '\"' +
                ",\"carTypeId\":" +
                carTypeId +
                ",\"carModelId\":" +
                carModelId +
                ",\"licStartDate\":\"" +
                licStartDate + '\"' +
                ",\"licEndDate\":\"" +
                licEndDate + '\"' +
                ",\"carNumber\":\"" +
                carNumber + '\"' +
                ",\"perName\":\"" +
                perName + '\"' +
                ",\"perPhone\":\"" +
                perPhone + '\"' +
                ",\"address\":\"" +
                address + '\"' +
                ",\"corUserId\":" +
                corUserId +
                ",\"carRemark\":\"" +
                carRemark + '\"' +
                '}';
    }

    public String getCarRemark() {
        return carRemark;
    }

    public void setCarRemark(String carRemark) {
        this.carRemark = carRemark;
    }

    public Long getCorUserId() {
        return corUserId;
    }

    public void setCorUserId(Long corUserId) {
        this.corUserId = corUserId;
    }

    public String getLicNumber() {
        return licNumber;
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    public Long getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Long carTypeId) {
        this.carTypeId = carTypeId;
    }

    public Long getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(Long carModelId) {
        this.carModelId = carModelId;
    }

    public Date getLicStartDate() {
        return licStartDate;
    }

    public void setLicStartDate(Date licStartDate) {
        this.licStartDate = licStartDate;
    }

    public Date getLicEndDate() {
        return licEndDate;
    }

    public void setLicEndDate(Date licEndDate) {
        this.licEndDate = licEndDate;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPerPhone() {
        return perPhone;
    }

    public void setPerPhone(String perPhone) {
        this.perPhone = perPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
