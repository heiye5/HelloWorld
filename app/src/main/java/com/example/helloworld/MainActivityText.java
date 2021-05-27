package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityText extends AppCompatActivity {
    private Button btn_login;
    private EditText et_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_text);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivityText.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });

        et_1 = findViewById(R.id.et_1);
        et_1.addTextChangedListener(new TextWatcher() {
            //文字改变之前
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            //文字改变当中,charSequence:当前输入框里面的内容
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //打印输入框里的内容
                Log.d("edittext",charSequence.toString());
            }

            //文字改变之后
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}