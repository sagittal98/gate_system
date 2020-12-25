package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbCarType implements Serializable {
    private Long carTypeId;

    private String typeName;

    private String carTypeStatus;


    @Override
    public String toString() {
        return "{" + "\"carTypeId\":" +
                carTypeId +
                ",\"typeName\":\"" +
                typeName + '\"' +
                ",\"carTypeStatus\":\"" +
                carTypeStatus + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Long carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getCarTypeStatus() {
        return carTypeStatus;
    }

    public void setCarTypeStatus(String carTypeStatus) {
        this.carTypeStatus = carTypeStatus == null ? null : carTypeStatus.trim();
    }
}