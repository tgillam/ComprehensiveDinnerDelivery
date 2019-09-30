package com.example.comprehensivedinnerdelivery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.InputStream;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder> {
    private Context mContext;
    private List<Restaurant> mData;

    RestaurantAdapter(Context mContext, List<Restaurant> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.news_list,viewGroup,false);
        final MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_title.setText(mData.get(i).getTitle());
        myViewHolder.tv_type.setText(mData.get(i).getRestaurantType());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout item;
        private TextView tv_title;
        private TextView tv_type;
        private ImageView tv_image;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item =  itemView.findViewById(R.id.news_item);
            tv_title = itemView.findViewById(R.id.txtTitle);
            tv_type = itemView.findViewById(R.id.txtDescription);
            tv_image = itemView.findViewById(R.id.image);
        }
    }

}
