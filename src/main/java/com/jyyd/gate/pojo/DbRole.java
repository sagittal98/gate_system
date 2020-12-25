package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbRole implements Serializable {
    private Long roleId;

    private String roleName;

    private String roleLevel;


    @Override
    public String toString() {
        return "{" + "\"roleId\":" +
                roleId +
                ",\"roleName\":\"" +
                roleName + '\"' +
                ",\"roleLevel\":\"" +
                roleLevel + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel == null ? null : roleLevel.trim();
    }
}