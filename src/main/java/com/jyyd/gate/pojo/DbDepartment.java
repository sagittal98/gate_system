package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbDepartment implements Serializable {
    private Long depId;

    private String depName;


    @Override
    public String toString() {
        return "{" + "\"depId\":" +
                depId +
                ",\"depName\":\"" +
                depName + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }
}