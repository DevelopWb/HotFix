package com.hotfixdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(getApplicationContext(), "测试hotfix", Toast.LENGTH_LONG).show();
    }
}
