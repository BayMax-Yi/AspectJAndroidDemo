package com.yt.demo.aspectjtest.aspectjutils;

import android.util.Log;
import android.widget.Toast;

import com.yt.demo.aspectjtest.Myapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class AspectJAfter {
    private final String TAG = "AspectJAfter";

    @After("execution(* com.yt.demo.aspectjtest.activity.AfterActivity.clickAfter(..))")
    public void aspectAfter(JoinPoint point) {
        Log.e(TAG, "aspectAfter: ");
    }
}
