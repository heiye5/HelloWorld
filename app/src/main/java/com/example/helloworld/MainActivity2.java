package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv4 = findViewById(R.id.tv_4);
        tv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);           //中位线
        tv4.getPaint().setAntiAlias(true);                              //去除锯齿

        tv5 = findViewById(R.id.tv_5);
        tv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);             //下划线

        tv6 = findViewById(R.id.tv_6);
        tv6.setText(Html.fromHtml("<u>yhr</u>"));

        tv7 = findViewById(R.id.tv_7);
        tv7.setSelected(true);
    }
}