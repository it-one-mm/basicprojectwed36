package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BottomNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);
        ImageView imageView=findViewById(R.id.loginimage);
        Glide.with(getApplicationContext())
                .load("https://image.tmdb.org/t/p/w300/vmpjv9CwcP8x1fJM6VTXdFVUbFK.jpg")
                .into(imageView);
    }
}
