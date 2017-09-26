package com.coolweather.android.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

/**
 * Created by 69026 on 2017/9/26.
 */

public class County extends DataSupport {
    private int id;
    private String countyName; //县的名字
    private String weatherId; //对应天气的id
    private int cityId; //县所属的市id

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

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityIdId(int cityId) {
        this.cityId= cityId;
    }
}

