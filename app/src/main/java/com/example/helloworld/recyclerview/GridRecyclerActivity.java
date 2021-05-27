package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.R;

public class GridRecyclerActivity extends AppCompatActivity {
    private RecyclerView mRvGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler);

        mRvGrid = findViewById(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(GridRecyclerActivity.this,3));
        mRvGrid.setAdapter(new GridAdapter(GridRecyclerActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecyclerActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}