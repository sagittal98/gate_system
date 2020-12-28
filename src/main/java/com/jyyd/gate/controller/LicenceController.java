package com.jyyd.gate.controller;

import com.alibaba.fastjson.JSONObject;
import com.jyyd.gate.common.regular.RegUtils;
import com.jyyd.gate.model.LicenceModel;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.service.LicenceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-28
 */
@Controller
@RequestMapping(value = "/licence/",method = RequestMethod.POST)
public class LicenceController {

    private final LicenceService licenceService;

    public LicenceController(LicenceService licenceService) {
        this.licenceService = licenceService;
    }

    /*
     *   登记车牌信息
     * */
    @RequestMapping("insertLicence")
    @ResponseBody
    Result<Boolean> insertLicence(@RequestBody JSONObject req) throws Exception {
        JSONObject licenceJsonObject = req.getJSONObject("licenceModel");
        LicenceModel licenceModel = RegUtils.jsonObjectToT(LicenceModel.class,licenceJsonObject);
        return licenceService.insertLicence(licenceModel);
    }



}
