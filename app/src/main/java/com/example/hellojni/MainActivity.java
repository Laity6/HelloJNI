package com.example.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //为什么这里只有 8个a 可以传递参数？
        ((TextView)findViewById(R.id.tv_hello_jni)).setText(JniUtils.getName("aaaaaaaa"));
    }
}


