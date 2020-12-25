package com.jyyd.gate.model;

import com.jyyd.gate.common.enums.ResultStateEnums;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * @Author sagittal
 * @describe 返回结果封装
 * @create 2020-12-25
 */
public class Result<T> implements Serializable {

    // 返回状态码
    private Integer code;
    // 返回状态信息
    private String codeDescribe;
    // 返回数据
    private T data;

    @Contract(pure = true)
    public Result() {
    }


    @Override
    public String toString() {
        return "{" + "\"code\":" +
                code +
                ",\"codeDescribe\":\"" +
                codeDescribe + '\"' +
                ",\"data\":" +
                data +
                '}';
    }


    // 成功
    @Contract(pure = true)
    private Result(T data, @NotNull ResultStateEnums resultStateEnum) {
        this.data = data;
        this.code = resultStateEnum.getState();
        this.codeDescribe = resultStateEnum.getStateInfo();
    }


    @Contract(pure = true)
    private Result(@NotNull ResultStateEnums resultStateEnum) {
        this.data = null;
        this.code = resultStateEnum.getState();
        this.codeDescribe = resultStateEnum.getStateInfo();
    }

    // 请求成功即返回
    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public static <T> Result<T> success(T data, @NotNull ResultStateEnums resultStateEnum) {
        return new Result<T>(data, resultStateEnum);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCodeDescribe() {
        return codeDescribe;
    }

    public void setCodeDescribe(String codeDescribe) {
        this.codeDescribe = codeDescribe;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
