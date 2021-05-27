package com.example.helloworld;

import android.app.Activity;
import android.view.View;

import utils.ToastUtil;

public class MyClickListener implements View.OnClickListener{
    private Activity activity;

    public MyClickListener(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        ToastUtil.showMsg(activity,"click...");
    }
}
