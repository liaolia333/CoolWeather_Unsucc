package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id; //每个实体类都会有的标识符
    private String countyName; //省的名字
    private String weatherid; //省的代号
    private int cityid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setWeatherId(String weather_id) {this.weatherid = weatherid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityId(int cityId) {
        this.cityid = cityid;
    }



}

