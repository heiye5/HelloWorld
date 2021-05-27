package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import utils.ToastUtil;

public class PopupWindowActivity extends AppCompatActivity {
    private Button mBtnPop;
    private PopupWindow mPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponpup_window);

        mBtnPop = findViewById(R.id.btn_pop);
        mBtnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.layout_popup,null);
//                TextView  textView = view.findViewById(R.id.tv_good);
//                textView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        mPop.dismiss();
//                        ToastUtil.showMsg(PopupWindowActivity.this,"好");
//                    }
//                });

                mPop = new PopupWindow(view1,mBtnPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.setOutsideTouchable(true);
                mPop.setFocusable(true);
                mPop.showAsDropDown(mBtnPop);
            }
        });
    }
}