package com.example.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.LinearViewHolder> {
    private Context mContext;
//    private List<String> list;
    private OnItemClickListener listener;

    public HorAdapter(Context mContext, OnItemClickListener listener) {
        this.mContext = mContext;
        this.listener = listener;
    }

    @Override
    public HorAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(HorAdapter.LinearViewHolder holder, int position) {
        holder.textView.setText("Hello");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(mContext,"click" + position,Toast.LENGTH_SHORT).show();
                listener.onClick(position);
            }
            
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);
    }

}
