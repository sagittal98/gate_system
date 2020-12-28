package com.jyyd.gate.dao;

import com.jyyd.gate.pojo.DbAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

/**
 * @Author sagittal
 * @describe 地址接口
 * @create 2020-12-25
 */
public interface AddressMapper {
    @Insert("insert into db_address(" +
            "country,province,city,add_information" +
            ")" +
            " values (" +
            "#{address.country}," +
            "#{address.province}," +
            "#{address.city}," +
            "#{address.addInformation}" +
            ")")
    @Options(useGeneratedKeys = true,keyProperty = "address.addId",keyColumn = "add_id")
    void insertAddress(@Param("address") DbAddress address);
}
