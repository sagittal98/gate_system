package com.jyyd.gate.pojo;

import com.jyyd.gate.model.LicenceModel;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Arrays;

public class DbAddress implements Serializable {
    private Long addId;

    private String country;

    private String province;

    private String city;

    private String addInformation;

    @Contract(pure = true)
    public DbAddress() {
    }

    public DbAddress(@NotNull LicenceModel licenceModel) {
        String addressStr = licenceModel.getAddress();
        String substring = addressStr.substring(1, addressStr.length() - 1);
        String[] split = substring.split(",");
        System.out.println(Arrays.toString(split));

        this.country = split[0];
        this.province = split[1];
        this.city = split[2];
        this.addInformation = split[3];
    }

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
                ",\"addInformation\":\"" +
                addInformation + '\"' +
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

    public String getAddInformation() {
        return addInformation;
    }

    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation == null ? null : addInformation.trim();
    }
}