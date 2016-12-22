package com.shangpin.demo.utils;

import java.io.IOException;

/**
 * Created by Administrator on 2016/12/18.
 */

public class ConfigHelper {
    static{
        PropertiesUtil util;
        try {
            util = new PropertiesUtil("conf/config.properties");
            priceApiUrl = util.readValue("priceApiUrl");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static String priceApiUrl;
    /**
     * priceApiUrl接口url（带最后的斜线）
     */
    public static String getPriceApiUrl() {
        return  priceApiUrl;
    }
}
