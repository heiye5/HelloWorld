package com.example.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInFlater;

    public MyGridViewAdapter(Context context) {
        this.mContext = context;
        this.mLayoutInFlater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null){
            view = mLayoutInFlater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_grid);
            holder.textView = view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }else{
            holder =(ViewHolder) view.getTag();
        }

        //赋值
        holder.textView.setText("花");
        Glide.with(mContext).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic21.nipic.com%2F20120516%2F6863287_045727051000_2.jpg&refer=http%3A%2F%2Fpic21.nipic.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621075853&t=38ace9a522d7870fe53f023d7439f9cd").into(holder.imageView);

        return view;
    }
}
