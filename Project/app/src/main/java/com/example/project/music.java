package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class music extends AppCompatActivity {
    MediaPlayer nuclear;
    MediaPlayer final_cnt;
    MediaPlayer itsMyLife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        nuclear = MediaPlayer.create(this,R.raw.nuclear);
        Switch switch_nuke = (Switch) findViewById(R.id.switch_nuclear);
        switch_nuke.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    nuclear.start();
                else
                    nuclear.pause();
            }
        });
        itsMyLife = MediaPlayer.create(this,R.raw.itsmylife);
        Switch switch_iml = (Switch) findViewById(R.id.switch_itsmylife);
        switch_iml.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    itsMyLife.start();
                else
                    itsMyLife.pause();
            }
        });
        final_cnt = MediaPlayer.create(this,R.raw.finalcountdown);
        Switch switch_fnlcnt = (Switch) findViewById(R.id.switch_theFinalCountdown);
        switch_fnlcnt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    final_cnt.start();
                else
                    final_cnt.pause();
            }
        });
    }
}