package com.yujing.ble;

import android.app.Application;
//参考 YBluetooth 工程
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(android.content.Context base) {
        super.attachBaseContext(base);
//        androidx.multidex.MultiDex.install(this);
    }
}
