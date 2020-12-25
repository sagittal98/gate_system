package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbAddress implements Serializable {
    private Long addId;

    private String country;

    private String province;

    private String city;

    private String addInformatino;


    @Override
    public String toString() {
        return "{" + "\"addId\":" +
                addId +
                ",\"country\":\"" +
                country + '\"' +
                ",\"province\":\"" +
                province + '\"' +
                ",\"city\":\"" +
                city + '\"' +
                ",\"addInformatino\":\"" +
                addInformatino + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addId) {
        this.addId = addId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddInformatino() {
        return addInformatino;
    }

    public void setAddInformatino(String addInformatino) {
        this.addInformatino = addInformatino == null ? null : addInformatino.trim();
    }
}