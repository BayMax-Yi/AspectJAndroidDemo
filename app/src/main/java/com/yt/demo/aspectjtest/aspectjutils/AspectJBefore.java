package com.yt.demo.aspectjtest.aspectjutils;

import android.util.Log;
import android.widget.Toast;

import com.yt.demo.aspectjtest.Myapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class AspectJBefore {
    private final String TAG = "AspectJBefore";

    @Before("execution(* com.yt.demo.aspectjtest.activity.BeforeActivity.clickBefore(..))")

    public void aspectBefore(JoinPoint point) {
        Log.e(TAG, "aspectBefore: ");
    }


    @Before("execution(* com.yt.demo.aspectjtest..Test.*(..))")
    public void  aspectSubPackage(JoinPoint point){
        Log.e(TAG, "aspectSubPackage: ");
    }

}
