package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbDepot implements Serializable {
    private Long depotId;

    private String depotName;


    @Override
    public String toString() {
        return "{" + "\"depotId\":" +
                depotId +
                ",\"depotName\":\"" +
                depotName + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getDepotId() {
        return depotId;
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName == null ? null : depotName.trim();
    }
}