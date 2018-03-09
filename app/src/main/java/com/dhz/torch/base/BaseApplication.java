package com.dhz.torch.base;

import android.app.Application;

/**
 * Created by cn on 2018/3/6.
 * Application
 */

public class BaseApplication extends Application {
    private static BaseApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this ;
    }


    private static BaseApplication getInstance(){

        return baseApplication;
    }
}
