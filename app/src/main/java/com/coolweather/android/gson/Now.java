package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.jar.Attributes;

/**
 * Created by 57278 on 2017/10/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("tet")
        public String info;
    }
}
