package com.yt.demo.aspectjtest.subpackage;

import android.util.Log;

import com.yt.demo.aspectjtest.annotation.Anno;


public class Test {
    final String TAG = "Test";

    @Anno
    public void logHello() {
        Log.e(TAG, "logHello: Hello!");
    }
}
