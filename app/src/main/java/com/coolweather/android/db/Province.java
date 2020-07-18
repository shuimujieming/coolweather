package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String privinceName;
    private int ProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrivinceName() {
        return privinceName;
    }

    public void setPrivinceName(String privinceName) {
        this.privinceName = privinceName;
    }

    public void setProvinceCode(int provinceCode) {
        ProvinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return ProvinceCode;
    }
}
