package com.jyyd.gate.dao;

import com.jyyd.gate.model.LicenceModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

/**
 * @Author sagittal
 * @describe  车牌接口文档
 * @create 2020-12-25
 */
public interface LicenceMapper {
    /**
     * 登记车牌信息
     * @param licenceModel  目标信息
     */
    @Insert("INSERT INTO db_licence( " +
            "lic_number," +
            "lic_start_date," +
            "lic_end_date," +
            "car_number," +
            "car_remark," +
            "cor_user_id," +
            "car_model_id," +
            "car_type_id" +
            " )" +
            " VALUES(" +
            "#{licenceModel.licNumber}," +
            "#{licenceModel.licStartDate}," +
            "#{licenceModel.licEndDate}," +
            "#{licenceModel.carNumber}," +
            "#{licenceModel.carRemark}," +
            "#{licenceModel.corUserId}," +
            "#{licenceModel.carModelId}," +
            "#{licenceModel.carTypeId}" +
            ")" )
    @Options(useGeneratedKeys = false)
    void insertLicence(@Param("licenceModel") LicenceModel licenceModel);
}
