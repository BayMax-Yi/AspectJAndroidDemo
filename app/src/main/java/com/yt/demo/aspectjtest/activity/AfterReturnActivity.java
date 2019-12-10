package com.yt.demo.aspectjtest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.yt.demo.aspectjtest.R;

import androidx.annotation.Nullable;

public class AfterReturnActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterreturn);
    }

    public int testReturn() {

        return 0;
    }

    public void clickAfterReturn(View view) {
        testReturn();
    }
}
