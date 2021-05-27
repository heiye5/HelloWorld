package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import utils.ToastUtil;

public class ToastActivity extends AppCompatActivity {

    private Button btn_toast_1;
    private Button btn_toast_2;
    private Button btn_toast_3;
    private Button btn_toast_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        btn_toast_1 = findViewById(R.id.btn_toast_1);
        btn_toast_2 = findViewById(R.id.btn_toast_2);
        btn_toast_3 = findViewById(R.id.btn_toast_3);
        btn_toast_4 = findViewById(R.id.btn_toast_4);

        OnClick onClick = new OnClick();
        btn_toast_1.setOnClickListener(onClick);
        btn_toast_2.setOnClickListener(onClick);
        btn_toast_3.setOnClickListener(onClick);
        btn_toast_4.setOnClickListener(onClick);

    }

    class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.btn_toast_1:
                    Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();
                    break;

                case R.id.btn_toast_2:
                    Toast toasCenter = Toast.makeText(getApplicationContext(),"居中",Toast.LENGTH_LONG);
                    toasCenter.setGravity(Gravity.CENTER,0,0);
                    toasCenter.show();
                    break;

                case R.id.btn_toast_3:
                    Toast toastCustom = new Toast(getApplicationContext());
                    LayoutInflater inflater = LayoutInflater.from(ToastActivity.this);
                    View view1 = inflater.inflate(R.layout.layout_toast,null);
                    ImageView imageView = view1.findViewById(R.id.iv_toast);
                    TextView textView = view1.findViewById(R.id.tv_toast);
                    imageView.setImageResource(R.drawable.ak47);
                    textView.setText("自定义");
                    toastCustom.setView(view1);
                    toastCustom.show();
                    break;

                case R.id.btn_toast_4:
                    ToastUtil.showMsg(getApplicationContext(),"包装");
                    break;
            }
        }
    }
}