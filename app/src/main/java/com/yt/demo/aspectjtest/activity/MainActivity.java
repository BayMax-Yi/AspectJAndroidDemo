package com.yt.demo.aspectjtest.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yt.demo.aspectjtest.R;
import com.yt.demo.aspectjtest.annotation.Anno;
import com.yt.demo.aspectjtest.subpackage.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* try {
            test("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Test().logHello();
        new TestReturnAndReFunComplete().sum();*/
    }


    public void click1(View view) {
        Toast.makeText(this, "按钮1", Toast.LENGTH_SHORT).show();
    }

    public void click2(View view) {
        Toast.makeText(this, "按钮2", Toast.LENGTH_SHORT).show();

    }

    @Anno
    @Deprecated
    @UiThread
    public void test(@Nullable @NonNull String drawable) throws Exception {
      }

    public void testAnnotation(View view) {

        startActivity(new Intent(this, AnnotationActivity.class));
    }

    public void testThrow(View view) {

        startActivity(new Intent(this, ThrowActivity.class));
    }

    public void testAfterReturn(View view) {

        startActivity(new Intent(this, AfterReturnActivity.class));
    }

    public void testAround(View view) {

        startActivity(new Intent(this, AroundActivity.class));
    }

    public void testAfter(View view) {
        startActivity(new Intent(this, AfterActivity.class));
    }

    public void testBefore(View view) {
        startActivity(new Intent(this, BeforeActivity.class));
    }
}
