package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 57278 on 2017/10/28.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
