package com.yt.demo.aspectjtest.aspectjutils;

import android.util.Log;
import android.widget.Toast;

import com.yt.demo.aspectjtest.Myapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class AspectJArround {
    private final String TAG = "AspectJArround";

    @Around("execution(* com.yt.demo.aspectjtest.activity.AroundActivity.clickAround(..))")
    public void aspectAround(ProceedingJoinPoint point) {
        Log.e(TAG, "aspectAround: ");
        MethodSignature signature = (MethodSignature) point.getSignature();
        if (//signature.getMethod().getDeclaringClass().getSimpleName().equals("MainActivity") &&
                signature.getMethod().getName().equals("onCreate")
        ) {
            try {
                point.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

        Toast.makeText(Myapp.instance, "替换原有方法" + point.getSignature().getName(), Toast.LENGTH_SHORT).show();
    }
}
