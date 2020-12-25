package com.jyyd.gate.common.enums;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/**
 * @Author sagittal
 * @describe 返回结果枚举
 * @create 2020-12-25
 */
public enum ResultStateEnums {
    // 请求成功
    SUCCESS(4000, "请求成功！"),
    // 账户不存在
    ACCOUNT_NOT_EXIST(4001, "账户不存在"),
    // 账户密码错误
    ACCOUNT_PASSWORD_WRONG(4002, "账户密码错误"),
    // 登录成功
    LOGIN_SUCCESSFUL(4003, "登录成功"),
    //密码修改成功
    CHANGE_SUCCESSFUL(4005,"密码修改成功"),
    //密码修改失败
    CHANGE_FAILED(4006,"密码修改失败"),
    // 车牌登记成功
    LICENCE_REGISTER_SUCCESSFUL(4004,"车牌登记成功"),
    // 账户注册成功
    ACCOUNT_REGISTER_SUCCESSFUL(4007,"账户注册成功")
    ;


    private int state;
    private String stateInfo;

    @Contract(pure = true)
    ResultStateEnums(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    @Contract(pure = true)
    public int getState() {
        return state;
    }

    @Contract(pure = true)
    public String getStateInfo() {
        return stateInfo;
    }

    @Nullable
    public static ResultStateEnums stateOf(int index) {
        for (ResultStateEnums state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

    // 根据代号返回信息
    @Nullable
    public static String stateInfo(int code) {
        for (ResultStateEnums state : values()) {
            if (state.getState() == code) {
                return state.stateInfo;
            }
        }
        return null;
    }
}
