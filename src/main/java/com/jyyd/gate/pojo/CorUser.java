package com.jyyd.gate.pojo;

import java.io.Serializable;

public class CorUser implements Serializable {
    /* 用户id */
    private Long corUserId;
    /* 角色id */
    private Long roleId;
    /* 个人信息id */
    private Long perId;
    /* 住址id */
    private Long addId;
    /* 用户密码 */
    private String password;

    private static final long serialVersionUID = 1L;

    public Long getCorUserId() {
        return corUserId;
    }

    public void setCorUserId(Long corUserId) {
        this.corUserId = corUserId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addId) {
        this.addId = addId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}