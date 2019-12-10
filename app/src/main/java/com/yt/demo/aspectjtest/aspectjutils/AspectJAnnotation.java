package com.yt.demo.aspectjtest.aspectjutils;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJAnnotation {
    private final String TAG = "AspectJAnnotation";

    @Before("execution(@com.yt.demo.aspectjtest.annotation.Anno * com.yt.demo.aspectjtest.activity..*(..))")
    public void beefore(JoinPoint point) {

        Log.e(TAG, "AspectJAnnotation: ");
    }

    @Pointcut("execution(@com.yt.demo.aspectjtest.annotation.Anno * com.yt.demo.aspetjtest..*(..))")
    public void  pointCut(){

    }

}
