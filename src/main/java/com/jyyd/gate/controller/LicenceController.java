package com.jyyd.gate.controller;

import com.alibaba.fastjson.JSONObject;
import com.jyyd.gate.common.regular.RegUtils;
import com.jyyd.gate.model.LicenceModel;
import com.jyyd.gate.model.Result;
import com.jyyd.gate.service.LicenceService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sagittal
 * @describe
 * @create 2020-12-28
 */
@Controller
@RequestMapping(value = "/licence/",method = RequestMethod.POST)
public class LicenceController {

    private final LicenceService licenceService;

    public LicenceController(LicenceService licenceService) {
        this.licenceService = licenceService;
    }

    @RequestMapping("insertLicence")
    @ResponseBody
    Result<Boolean> insertLicence(@NotNull @RequestBody JSONObject req) throws InstantiationException, IllegalAccessException {
       //  LicenceModel licenceModel
        JSONObject jsonObject = req.getJSONObject(String.valueOf(licenceService));
        LicenceModel licenceModel = RegUtils.jsonObjectToT(LicenceModel.class, jsonObject);
        return licenceService.insertLicence(licenceModel);
    }

}
