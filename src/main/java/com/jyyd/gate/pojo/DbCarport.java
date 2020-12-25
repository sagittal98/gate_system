package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbCarport implements Serializable {
    private Long carportId;

    private Long carportNumber;

    private String carportStatus;

    private Long depotId;

    private Long licId;


    @Override
    public String toString() {
        return "{" + "\"carportId\":" +
                carportId +
                ",\"carportNumber\":" +
                carportNumber +
                ",\"carportStatus\":\"" +
                carportStatus + '\"' +
                ",\"depotId\":" +
                depotId +
                ",\"licId\":" +
                licId +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getCarportId() {
        return carportId;
    }

    public void setCarportId(Long carportId) {
        this.carportId = carportId;
    }

    public Long getCarportNumber() {
        return carportNumber;
    }

    public void setCarportNumber(Long carportNumber) {
        this.carportNumber = carportNumber;
    }

    public String getCarportStatus() {
        return carportStatus;
    }

    public void setCarportStatus(String carportStatus) {
        this.carportStatus = carportStatus == null ? null : carportStatus.trim();
    }

    public Long getDepotId() {
        return depotId;
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    public Long getLicId() {
        return licId;
    }

    public void setLicId(Long licId) {
        this.licId = licId;
    }
}