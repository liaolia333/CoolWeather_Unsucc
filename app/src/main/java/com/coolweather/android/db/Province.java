package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id; //每个实体类都会有的标识符
    private String provinceName; //省的名字
    private int provinceId; //省的代号
    /* 以下为对应生成的 getter 和 setter */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
