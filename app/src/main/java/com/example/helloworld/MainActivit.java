package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivit extends AppCompatActivity {
    private Button btn_ui;
    private Button event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ui = findViewById(R.id.btn_ui);
        event = findViewById(R.id.btn_event);

        Onclick onclick = new Onclick();
        btn_ui.setOnClickListener(onclick);
        event.setOnClickListener(onclick);
    }

    class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch(view.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivit.this, UIActivity.class);
                    break;
                case R.id.btn_event:
                    intent = new Intent(MainActivit.this,EventActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}