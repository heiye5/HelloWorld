package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import utils.ToastUtil;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{
    private Button event;
    private Button mybutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        event = findViewById(R.id.btn_event);
        mybutton = findViewById(R.id.mybutton);

        //内部类实现
        event.setOnClickListener(new onClick());

        //匿名内部类
//        event.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ToastUtil.showMsg(EventActivity.this,"click...");
//            }
//        });

//        event.setOnClickListener(EventActivity.this);

//        event.setOnClickListener(new MyClickListener(EventActivity.this));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_event:
                ToastUtil.showMsg(EventActivity.this,"click...");
                break;
        }
    }

    class onClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_event:
                    ToastUtil.showMsg(EventActivity.this,"click...");
                    break;
            }
        }
    }

    public void show(View v){
        switch (v.getId()){
            case R.id.btn_event:
                ToastUtil.showMsg(EventActivity.this,"click...");
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("Activity","onTouchEvent");
                break;
        }
        return false;
    }
}