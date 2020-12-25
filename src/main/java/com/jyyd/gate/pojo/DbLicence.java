package com.jyyd.gate.pojo;

import java.io.Serializable;
import java.util.Date;

public class DbLicence implements Serializable {
    private Long licId;

    private String licNumber;

    private Date licStartDate;

    private Date licEndDate;

    private Long carNumber;

    private String carRemark;

    private Long corUserId;


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
                '}';
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