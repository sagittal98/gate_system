package com.jyyd.gate.pojo;

import java.io.Serializable;
import java.util.Date;

public class DbPersonal implements Serializable {
    /* 人事id */
    private Long perId;
    /* 姓名 */
    private String perName;
    /* 性别 */
    private String perSex;
    /* 出生 */
    private Date perBirth;
    /* 身份证 */
    private String perIdcard;
    /* 婚否 */
    private String perMarriage;
    /* 职位 */
    private String perJobNumber;
    /* 电话 */
    private String perPhone;
    /* 座机 */
    private String perSpecialPhone;
    /* 创建时间 */
    private Date perCreateTime;


    @Override
    public String toString() {
        return "{" + "\"perId\":" +
                perId +
                ",\"perName\":\"" +
                perName + '\"' +
                ",\"perSex\":\"" +
                perSex + '\"' +
                ",\"perBirth\":\"" +
                perBirth + '\"' +
                ",\"perIdcard\":\"" +
                perIdcard + '\"' +
                ",\"perMarriage\":\"" +
                perMarriage + '\"' +
                ",\"perJobNumber\":\"" +
                perJobNumber + '\"' +
                ",\"perPhone\":\"" +
                perPhone + '\"' +
                ",\"perSpecialPhone\":\"" +
                perSpecialPhone + '\"' +
                ",\"perCreateTime\":\"" +
                perCreateTime + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getPerSex() {
        return perSex;
    }

    public void setPerSex(String perSex) {
        this.perSex = perSex == null ? null : perSex.trim();
    }

    public Date getPerBirth() {
        return perBirth;
    }

    public void setPerBirth(Date perBirth) {
        this.perBirth = perBirth;
    }

    public String getPerIdcard() {
        return perIdcard;
    }

    public void setPerIdcard(String perIdcard) {
        this.perIdcard = perIdcard == null ? null : perIdcard.trim();
    }

    public String getPerMarriage() {
        return perMarriage;
    }

    public void setPerMarriage(String perMarriage) {
        this.perMarriage = perMarriage == null ? null : perMarriage.trim();
    }

    public String getPerJobNumber() {
        return perJobNumber;
    }

    public void setPerJobNumber(String perJobNumber) {
        this.perJobNumber = perJobNumber == null ? null : perJobNumber.trim();
    }

    public String getPerPhone() {
        return perPhone;
    }

    public void setPerPhone(String perPhone) {
        this.perPhone = perPhone == null ? null : perPhone.trim();
    }

    public String getPerSpecialPhone() {
        return perSpecialPhone;
    }

    public void setPerSpecialPhone(String perSpecialPhone) {
        this.perSpecialPhone = perSpecialPhone == null ? null : perSpecialPhone.trim();
    }

    public Date getPerCreateTime() {
        return perCreateTime;
    }

    public void setPerCreateTime(Date perCreateTime) {
        this.perCreateTime = perCreateTime;
    }
}