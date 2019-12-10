package com.yt.demo.aspectjtest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yt.demo.aspectjtest.R;
import com.yt.demo.aspectjtest.annotation.Anno;

import androidx.annotation.Nullable;

public class AnnotationActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);
    }

    @Anno
    public void clickAnnotation(View view) {
        Toast.makeText(this,"测试After",Toast.LENGTH_SHORT).show();
    }
}
