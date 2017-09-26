package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 69026 on 2017/9/26.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName; //省的名字
    private int provinceCode; //省的代号
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
