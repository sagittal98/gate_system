package com.jyyd.gate.model;

import java.io.Serializable;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-25
 */
public class UserModel implements Serializable {
    private String perName;
    private String passWord;
    private String roleLevel;

    public UserModel() {
    }

    public UserModel(String perName, String passWord) {
        this.perName = perName;
        this.passWord = passWord;
    }

    @Override
    public String toString() {

        return "{" + "\"perName\":\"" +
                perName + '\"' +
                ",\"passWord\":\"" +
                passWord + '\"' +
                '}';
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
