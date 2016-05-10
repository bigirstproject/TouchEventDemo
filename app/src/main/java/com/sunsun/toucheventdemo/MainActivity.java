package com.sunsun.toucheventdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
<<<<<<< HEAD
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout linearLayout;
=======

public class MainActivity extends AppCompatActivity {
    private MyLinearLayout linearLayout;
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
    private MyTestView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        linearLayout = (FrameLayout) findViewById(R.id.linearlayout);
        textView = (MyTestView) findViewById(R.id.textview);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "textView", Toast.LENGTH_SHORT).show();
    }
=======
        linearLayout = (MyLinearLayout) findViewById(R.id.linearlayout);
        textView = (MyTestView) findViewById(R.id.textview);
    }

>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
}
