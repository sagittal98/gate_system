package com.jyyd.gate.controller;

import com.alibaba.fastjson.JSONObject;
import com.jyyd.gate.common.regular.RegUtils;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.model.UserModel;
import com.jyyd.gate.pojo.DbAddress;
import com.jyyd.gate.pojo.DbPersonal;
import com.jyyd.gate.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author sagittal
 * @describe
 * @create 2020-12-25
 */
@Controller
@RequestMapping(value = "/user/",method = RequestMethod.POST)
public class UserController {



   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * 登录用户
     * @param req  参数
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    Result<UserModel> login(@NotNull @RequestBody JSONObject req) throws InstantiationException, IllegalAccessException {
        JSONObject userJsonObject = req.getJSONObject("userModel");
        UserModel userModel = RegUtils.jsonObjectToT(UserModel.class, userJsonObject);
        return userService.selectUser(userModel);
    }

    /**
     * 注册用户
     * @param req 参数
     * @return
     */
    @RequestMapping("register")
    @ResponseBody
    Result<Boolean> registerUser(@NotNull @RequestBody JSONObject req) throws InstantiationException, IllegalAccessException {
        JSONObject personalJsonObject = req.getJSONObject("personal");
        DbPersonal dbPersonal = RegUtils.jsonObjectToT(DbPersonal.class, personalJsonObject);
        JSONObject addressJsonObject = req.getJSONObject("address");
        DbAddress dbAddress = RegUtils.jsonObjectToT(DbAddress.class, addressJsonObject);
        return userService.insertUser(dbPersonal,dbAddress);
    }

    /**
     * 修改账户密码
     * @param req
     * @return
     */
    @RequestMapping("updatePassWord")
    @ResponseBody
    Result<Boolean> updatePassWord(@NotNull @RequestBody JSONObject req){
        // String passWord,Long id
        String passWord = req.getString("passWord");
        Long corUserId = req.getLong("corUserId");
        return userService.updatePassWord(passWord,corUserId);
    }
}
