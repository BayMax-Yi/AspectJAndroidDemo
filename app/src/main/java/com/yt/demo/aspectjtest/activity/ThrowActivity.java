package com.yt.demo.aspectjtest.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.yt.demo.aspectjtest.R;

import androidx.annotation.Nullable;

public class ThrowActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_throw);
    }


    public void clickAfterThrow(View view) {
        Context context = null;
        context.getResources();
    }
}
