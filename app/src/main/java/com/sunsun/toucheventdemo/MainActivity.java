package com.sunsun.toucheventdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MyLinearLayout linearLayout;
    private MyTestView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (MyLinearLayout) findViewById(R.id.linearlayout);
        textView = (MyTestView) findViewById(R.id.textview);
    }

}
