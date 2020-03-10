package com.solarexsoft.multiprocessdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static Utils utils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_go).setOnClickListener(this);
        utils = new Utils();
        utils.test(this.toString());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_go) {
            startActivity(new Intent(this, DemoActivity.class));
        }
    }
}
