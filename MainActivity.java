package com.example.imagedownloading_throughinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img1,img2;
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        String[]  urls=
                {
                 "https://m.cricbuzz.com/a/img/v1/192x192/i1/c171004/sachin-tendulkar.jpg",
                 "https://www.onlineworldofwrestling.com/wp-content/uploads/2018/12/Lesnar.jpg"
                };
        Glide.with(this).load(urls[0]).into(img1);
        Glide.with(this).load(urls[1]).into(img2);
    }
}
