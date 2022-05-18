package com.example.forecast.base;

import android.app.Application;

import com.example.forecast.db.DBManager;

import org.xutils.x;

public class UniteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DBManager.initDB(this);
    }
}
