package com.example.hoangminh.volley;

import android.app.Application;
import android.content.Context;

/**
 * Created by hoangminh on 9/11/15.
 */
public class App extends Application {
    private static Context appContext;

    public static Context getAppContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }
}
