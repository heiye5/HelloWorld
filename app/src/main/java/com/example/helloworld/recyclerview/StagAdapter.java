package com.example.helloworld.recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

public class StagAdapter extends RecyclerView.Adapter<StagAdapter.LinearViewHolder> {
    private Context mContext;
//    private List<String> list;
    private OnItemClickListener listener;

    public StagAdapter(Context mContext, OnItemClickListener listener) {
        this.mContext = mContext;
        this.listener = listener;
    }

    @Override
    public StagAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_steg_item,parent,false));
    }

    @Override
    public void onBindViewHolder(StagAdapter.LinearViewHolder holder, int position) {
        if(position%2 != 0){
            holder.imageView.setImageResource(R.drawable.image240);
        }else{
            holder.imageView.setImageResource(R.drawable.image);
        }
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
        private ImageView imageView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);
    }

}
