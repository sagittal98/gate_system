package com.jyyd.gate.pojo;

import java.io.Serializable;
import java.util.Date;

public class DbLicence implements Serializable {
    // 车牌号id
    private Long licId;
    // 车牌号
    private String licNumber;
    // 车牌有效起时间
    private Date licStartDate;
    // 车牌有效止时间
    private Date licEndDate;
    // 车辆序号
    private Long carNumber;
    // 车辆备注
    private String carRemark;
    // 用户id
    private Long corUserId;
    // 品牌id
    private Long carModelId;
    // 类型id
    private Long carTypeId;


    @Override
    public String toString() {
        return "{" + "\"licId\":" +
                licId +
                ",\"licNumber\":\"" +
                licNumber + '\"' +
                ",\"licStartDate\":\"" +
                licStartDate + '\"' +
                ",\"licEndDate\":\"" +
                licEndDate + '\"' +
                ",\"carNumber\":" +
                carNumber +
                ",\"carRemark\":\"" +
                carRemark + '\"' +
                ",\"corUserId\":" +
                corUserId +
                ",\"carModelId\":" +
                carModelId +
                ",\"carTypeId\":" +
                carTypeId +
                '}';
    }

    public Long getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(Long carModelId) {
        this.carModelId = carModelId;
    }

    public Long getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Long carTypeId) {
        this.carTypeId = carTypeId;
    }


    private static final long serialVersionUID = 1L;

    public Long getLicId() {
        return licId;
    }

    public void setLicId(Long licId) {
        this.licId = licId;
    }

    public String getLicNumber() {
        return licNumber;
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber == null ? null : licNumber.trim();
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

    public Long getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Long carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarRemark() {
        return carRemark;
    }

    public void setCarRemark(String carRemark) {
        this.carRemark = carRemark == null ? null : carRemark.trim();
    }

    public Long getCorUserId() {
        return corUserId;
    }

    public void setCorUserId(Long corUserId) {
        this.corUserId = corUserId;
    }
}