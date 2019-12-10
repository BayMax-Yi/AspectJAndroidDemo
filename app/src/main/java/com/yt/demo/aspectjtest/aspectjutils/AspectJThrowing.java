package com.yt.demo.aspectjtest.aspectjutils;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectJThrowing {
    private final String TAG = "AspectJThrowing";

    @AfterThrowing(value = "execution(* com.yt.demo.aspectjtest.activity.ThrowActivity.clickAfterThrow(..))" , throwing="ex")
    public void AfterThrowing(Throwable throwable) {
        Log.e(TAG, "AfterThrowing: "+throwable.getMessage());
    }
}
