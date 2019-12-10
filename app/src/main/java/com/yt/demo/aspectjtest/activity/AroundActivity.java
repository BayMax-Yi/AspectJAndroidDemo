package com.yt.demo.aspectjtest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yt.demo.aspectjtest.R;

import androidx.annotation.Nullable;

public class AroundActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aound);
    }

    public void clickAround(View view) {
        Toast.makeText(this,"测试Around",Toast.LENGTH_SHORT).show();
    }
}
