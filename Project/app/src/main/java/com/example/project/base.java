package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class base extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    public void music(View v){
        Intent basetomusic = new Intent();
        basetomusic.setClass(this,music.class);
        startActivity(basetomusic);
    }

    public void movies(View v){
        Intent basetomovies = new Intent();
        basetomovies.setClass(this,movies.class);
        startActivity(basetomovies);
        startActivity(basetomovies);
    }

    public void referal(View v) {
        Intent sms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:5556"));
        sms.putExtra("smsBody","Hi! I am using College Locker,come use it and make your life easy");
        startActivity(sms);

    }

    public void rate(View v){
        Intent basetorate = new Intent();
        basetorate.setClass(this,rating.class);
        startActivity(basetorate);
    }



}