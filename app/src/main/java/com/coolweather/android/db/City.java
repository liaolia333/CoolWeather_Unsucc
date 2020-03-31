package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int id; //每个实体类都会有的标识符
    private String cityName; //省的名字
    private int cityCode; //省的代号
    private int provinceCode;

    public void setProvinceId(int provinceId) {
    }
//    int id ：定位编号
//    String cityName : 市的名字
//    int cityCode : 市的代号
//    int provinceCode : 当前市所属省的 id




}

