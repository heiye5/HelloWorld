package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.d("lifecycle","-------onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","-------onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","-------onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","-------onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","-------onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","-------onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","-------onDestroy");
    }
}
