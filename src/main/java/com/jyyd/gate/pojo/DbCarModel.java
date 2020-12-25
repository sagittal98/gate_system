package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbCarModel implements Serializable {
    private Long carModelId;

    private String modelName;


    @Override
    public String toString() {
        return "{" + "\"carModelId\":" +
                carModelId +
                ",\"modelName\":\"" +
                modelName + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(Long carModelId) {
        this.carModelId = carModelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }
}