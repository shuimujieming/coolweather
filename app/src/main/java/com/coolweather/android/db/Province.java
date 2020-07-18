package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int ProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setPrivinceName(String privinceName) {
        this.provinceName = privinceName;
    }

    public void setProvinceCode(int provinceCode) {
        ProvinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return ProvinceCode;
    }
}
