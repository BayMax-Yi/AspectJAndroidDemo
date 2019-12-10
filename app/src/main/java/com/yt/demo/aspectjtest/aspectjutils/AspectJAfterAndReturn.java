package com.yt.demo.aspectjtest.aspectjutils;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectJAfterAndReturn {
    private final String TAG = "AspectJAfterAndReturn";

    @After("execution(* com.yt.demo.aspectjtest.activity.AfterReturnActivity.clickAfterReturn(..))")
    public void aspectAfter(JoinPoint point) {
        Log.e(TAG, "aspectAfter: ");
    }

    @AfterReturning("execution(* com.yt.demo.aspectjtest.activity.AfterReturnActivity.clickAfterReturn(..))")
    public void aspectAfterReturning(JoinPoint point) {
        Log.e(TAG, "AfterReturning: ");
    }
}
