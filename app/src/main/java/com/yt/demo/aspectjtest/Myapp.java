package com.yt.demo.aspectjtest;

import android.app.Application;

public class Myapp extends Application
{
    public static Myapp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
