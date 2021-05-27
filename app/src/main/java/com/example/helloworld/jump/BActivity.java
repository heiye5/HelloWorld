package com.example.helloworld.jump;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class BActivity extends AppCompatActivity {
    private TextView tv_title;
    private Button finish;
    private Button finish2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.d("BActivity","onCreate");
        Log.d("BActivity","taskid" + getTaskId() + ",hash : " + hashCode());
        logtaskName();

        tv_title = findViewById(R.id.tv_title);
        finish = findViewById(R.id.finish);
        finish2 = findViewById(R.id.finish2);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");

        tv_title.setText(name + age);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bundle1 = new Bundle();
                bundle1.putString("title","数据回传");
                intent.putExtras(bundle1);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });

        finish2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BActivity.this,BActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("BActivity","onCreate");
        Log.d("BActivity","taskid" + getTaskId() + ",hash : " + hashCode());
        logtaskName();
    }

    private void logtaskName(){
        try {
            ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.d("BActivity",info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

}
