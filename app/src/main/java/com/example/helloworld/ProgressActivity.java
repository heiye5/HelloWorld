package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import utils.ToastUtil;

public class ProgressActivity extends AppCompatActivity {
    private ProgressBar pd3;
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        pd3 = findViewById(R.id.pd3);
        btn_start = findViewById(R.id.btn_start);
        pd3.setProgress(30);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.sendEmptyMessage(0);
            }
        });
    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if(pd3.getProgress() < 100){
                handler.postDelayed(runnable,500);
            }else{
                ToastUtil.showMsg(ProgressActivity.this,"加载完成");
            }
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            pd3.setProgress(pd3.getProgress() + 5);
            handler.sendEmptyMessage(0);
        }
    };
}