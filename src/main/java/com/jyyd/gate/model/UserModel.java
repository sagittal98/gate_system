package com.jyyd.gate.model;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
public class UserModel implements Serializable {
    private Long corUserId;
    private String perName;
    private String passWord;
    private String roleLevel;

    @Contract(pure = true)
    public UserModel() {
    }

    @Override
    public String toString() {
        return "{" + "\"corUserId\":" +
                corUserId +
                ",\"perName\":\"" +
                perName + '\"' +
                ",\"passWord\":\"" +
                passWord + '\"' +
                ",\"roleLevel\":\"" +
                roleLevel + '\"' +
                '}';
    }


    public Long getCorUserId() {
        return corUserId;
    }

    public void setCorUserId(Long corUserId) {
        this.corUserId = corUserId;
    }

    @Contract(pure = true)
    public UserModel(String perName, String passWord) {
        this.perName = perName;
        this.passWord = passWord;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
