package com.example.helloworld.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;

public class ContainerActivity extends AppCompatActivity implements AFragment.IOnMessageClick {
    private AFragment aFragment;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contationer);

        title = findViewById(R.id.tv_title);

        aFragment = AFragment.newInstance("参数传递");
        getFragmentManager().beginTransaction()
                .add(R.id.fl_contation,aFragment,"a")
                .commitAllowingStateLoss();
    }

    public void setData(String text){
        title.setText(text);
    }

    @Override
    public void onClick(String text) {
        title.setText(text);
    }
}