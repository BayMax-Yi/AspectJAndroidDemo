package com.yt.demo.aspectjtest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yt.demo.aspectjtest.R;
import com.yt.demo.aspectjtest.subpackage.Test;

import androidx.annotation.Nullable;

public class BeforeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before);
    }


    public void clickBefore(View view) {
        new Test().logHello();
        Toast.makeText(this,"测试Before",Toast.LENGTH_SHORT).show();
    }
}
