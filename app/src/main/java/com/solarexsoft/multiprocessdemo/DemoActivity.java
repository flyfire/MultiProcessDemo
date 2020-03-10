package com.solarexsoft.multiprocessdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 18:44/2020/3/10
 *    Desc:
 * </pre>
 */

public class DemoActivity extends AppCompatActivity {
    static Utils utils;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        TextView textView = findViewById(R.id.tv);
        utils = new Utils();
        utils.test(this.toString());
        textView.setText(String.valueOf(MainActivity.utils));
    }
}
