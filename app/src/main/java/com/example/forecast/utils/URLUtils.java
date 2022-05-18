package com.example.forecast.utils;

public class URLUtils {

    public static final  String KEY = "SVxPvoQcr_OIk0dH1";
    public static String temp_url = "https://api.seniverse.com/v3/weather/daily.json?language=zh-Hans&unit=c&start=0&days=5";

    public static String index_url = "https://api.seniverse.com/v3/life/suggestion.json?language=zh-Hans";

    public static String getTemp_url(String location){
        String url = temp_url+"&key="+KEY+"&location="+location;
        return url;
    }

    public static String getIndex_url(String location){
        String url = index_url+"&key="+KEY+"&location="+location;
        return url;
    }
}
