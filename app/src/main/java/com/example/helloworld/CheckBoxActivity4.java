package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity4 extends AppCompatActivity {
    private CheckBox checkBox5;
    private CheckBox checkBox6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box4);
        checkBox5 = findViewById(R.id.cb_5);
        checkBox6 = findViewById(R.id.cb_6);

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity4.this,b?"5选中":"5未选中",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity4.this,b?"6选中":"6未选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}