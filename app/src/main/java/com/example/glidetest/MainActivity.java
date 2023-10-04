package com.example.glidetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    ImageView IImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IImageView = findViewById(R.id.imageView);

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.placeholder)//正在请求图片时展示的照片
                .error(R.drawable.error)//如果请求失败的时候展示的照片，（如果没有设置则展示placeholder）
                .fallback(R.drawable.fallback)//如果请求的url/model为null时的展示照片（如果没有设置则展示placeholder）
                .override(100,100);//图片宽高

        Glide.with(this)
                .load("http://39.103.216.115:8081/music/1.png")
                .apply(requestOptions)
                .into(IImageView);

    }
}