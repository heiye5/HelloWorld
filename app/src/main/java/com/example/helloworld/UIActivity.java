 package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.fragment.ContainerActivity;
import com.example.helloworld.gridview.GirdViewActivity;
import com.example.helloworld.jump.AActivity;
import com.example.helloworld.listview.ListViewActivity;
import com.example.helloworld.recyclerview.RecycleViewActivity;

 public class UIActivity extends AppCompatActivity {
    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button checkBoxBtn;
    private Button imgBtn;
    private Button listViewBtn;
    private Button mBtnGridView;
    private Button mRcycle;
    private Button btn_webview;
    private Button btn_toast;
    private Button btn_alert;
    private Button btn_progress;
    private Button btn_dialog;
    private Button btn_popup;
    private Button btn_lifecycle;
    private Button btn_jump;
    private Button btn_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        btn = findViewById(R.id.btn_textview1);
        btn2 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        checkBoxBtn = findViewById(R.id.btn5);
        imgBtn = findViewById(R.id.imgBtn6);
        listViewBtn = findViewById(R.id.listview);
        mBtnGridView = findViewById(R.id.btn_girdview);
        mRcycle = findViewById(R.id.btn_recycler);
        btn_webview = findViewById(R.id.btn_webview);
        btn_toast = findViewById(R.id.btn_toast);
        btn_alert = findViewById(R.id.btn_alert);
        btn_progress = findViewById(R.id.btn_progress);
        btn_dialog = findViewById(R.id.btn_dialog);
        btn_popup = findViewById(R.id.btn_popup);
        btn_lifecycle = findViewById(R.id.btn_lifecycycle);
        btn_jump = findViewById(R.id.btn_jump);
        btn_fragment = findViewById(R.id.btn_fragment);
        setListeners();

    }

    private void setListeners(){
        onClick onClick = new onClick();
        btn.setOnClickListener(onClick);
        btn2.setOnClickListener(onClick);
        btn3.setOnClickListener(onClick);
        btn4.setOnClickListener(onClick);
        checkBoxBtn.setOnClickListener(onClick);
        imgBtn.setOnClickListener(onClick);
        listViewBtn.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mRcycle.setOnClickListener(onClick);
        btn_webview.setOnClickListener(onClick);
        btn_toast.setOnClickListener(onClick);
        btn_alert.setOnClickListener(onClick);
        btn_progress.setOnClickListener(onClick);
        btn_dialog.setOnClickListener(onClick);
        btn_popup.setOnClickListener(onClick);
        btn_lifecycle.setOnClickListener(onClick);
        btn_jump.setOnClickListener(onClick);
        btn_fragment.setOnClickListener(onClick);
    }


    private class onClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview1:
                    //跳转到TextView界面
                    intent = new Intent(UIActivity.this,MainActivity2.class);
                    break;

                //跳转到Button界面
                case R.id.btn1:
                    intent = new Intent(UIActivity.this,MainActivity3.class);
                    break;

                //跳转到EditText界面
                case R.id.btn3:
                    intent = new Intent(UIActivity.this,MainActivityText.class);
                    break;

                //跳转到RadioButton界面
                case R.id.btn4:
                    intent = new Intent(UIActivity.this,RadioButtonMainActivity.class);
                    break;

                //跳转到checkButton界面
                case R.id.btn5:
                    intent = new Intent(UIActivity.this,CheckBoxActivity4.class);
                    break;

                case R.id.imgBtn6:
                    intent = new Intent(UIActivity.this,ImageActivity.class);
                    break;

                //跳转到listview界面
                case R.id.listview:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;

                //跳转到gridView界面
                case R.id.btn_girdview:
                    intent = new Intent(UIActivity.this, GirdViewActivity.class);
                    break;

                //跳转到recycler界面
                case R.id.btn_recycler:
                    intent = new Intent(UIActivity.this, RecycleViewActivity.class);
                    break;

                //跳转到webView界面
                case R.id.btn_webview:
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;

                //跳转到Toast界面
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;

                //跳转到Alert界面
                case R.id.btn_alert:
                    intent = new Intent(UIActivity.this,DialogActivity.class);
                    break;

                //跳转到Progress界面
                case R.id.btn_progress:
                    intent = new Intent(UIActivity.this,ProgressActivity.class);
                    break;

                //跳转到Dialog界面
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;

                //跳转到Popup界面
                case R.id.btn_popup:
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;

                //跳转到LifeCycle界面
                case R.id.btn_lifecycycle:
                    intent = new Intent(UIActivity.this, LifeCycleActivity.class);
                    break;

                //跳转到A界面
                case R.id.btn_jump:
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;

                //跳转到Fragment界面
                case R.id.btn_fragment:
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}