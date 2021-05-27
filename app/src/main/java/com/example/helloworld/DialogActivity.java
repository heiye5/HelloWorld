package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.LayoutInflaterFactory;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import utils.ToastUtil;

public class DialogActivity extends AppCompatActivity {
    private Button btn_dialog1;
    private Button btn_dialog2;
    private Button btn_dialog3;
    private Button btn_dialog4;
    private Button btn_dialog5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        btn_dialog1 = findViewById(R.id.btn_dialog1);
        btn_dialog2 = findViewById(R.id.btn_dialog2);
        btn_dialog3 = findViewById(R.id.btn_dialog3);
        btn_dialog4 = findViewById(R.id.btn_dialog4);
        btn_dialog5 = findViewById(R.id.btn_dialog5);

        OnClick onClick = new OnClick();

        btn_dialog1.setOnClickListener(onClick);
        btn_dialog2.setOnClickListener(onClick);
        btn_dialog3.setOnClickListener(onClick);
        btn_dialog4.setOnClickListener(onClick);
        btn_dialog5.setOnClickListener(onClick);

    }

    class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                    builder.setTitle("请问").setMessage("你觉得...？")
                            .setIcon(R.drawable.ak47)
                    .setPositiveButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"性");
                        }
                    }).setNeutralButton("还好", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"好");
                        }
                    }).setNegativeButton("不行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"遗憾");
                        }
                    }).show();
                    break;

                case R.id.btn_dialog2:
                    String[] array = new String[]{"男","女"};
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogActivity.this);
                    builder1.setTitle("选择性别").setItems(array, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,array[i]);
                        }
                    }).show();
                    break;

                case R.id.btn_dialog3:
                    String[] array3 = new String[]{"男","女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("选择性别").setSingleChoiceItems(array3, 1, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,array3[i]);
                            dialogInterface.dismiss();              //选框关闭
                        }
                    }).setCancelable(false).show();
                    break;

                case R.id.btn_dialog4:
                    String[] array4 = new String[]{"足球","篮球","羽毛球"};
                    boolean[] isSelect = new boolean[]{false,false,true};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("选择兴趣").setMultiChoiceItems(array4, isSelect, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                            ToastUtil.showMsg(DialogActivity.this,array4[i]+ ":" + isSelect);
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).show();
                    break;

                case R.id.btn_dialog5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                    View view5 = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
                    EditText et_usesrname = view.findViewById(R.id.et_usesrname);
                    EditText et_password = view.findViewById(R.id.et_password);
                    Button btn_dialog5 =view.findViewById(R.id.btn_dialog5);
                    btn_dialog5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                    builder5.setTitle("登录").setView(view5).show();
                    break;
            }
        }
    }
}