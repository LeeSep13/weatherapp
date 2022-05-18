package com.example.forecast.db;

public class DatabaseBean {
    private int _id; //数据库的主键
    private String city; //存储的城市
    private String content; //相关的天气信息内容

    public DatabaseBean() {
    }

    public DatabaseBean(int _id, String city, String content) {
        this._id = _id;
        this.city = city;
        this.content = content;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
