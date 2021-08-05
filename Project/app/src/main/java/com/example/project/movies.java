package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class movies extends AppCompatActivity {
    NumberPicker picker;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        picker = (NumberPicker) findViewById(R.id.numberpicker);
        webView = (WebView) findViewById(R.id.webview_xml);
        String[] item = {
                "Game of Thrones",
                "The Boys",
                "Death note",
                "Lucifer"
        };
        picker.setDisplayedValues(item);
        picker.setMinValue(0);
        picker.setMaxValue(item.length-1);
    }

    public void movie_web(View v){
        int choice = picker.getValue();
        if (choice==0)
            webView.loadUrl("https://www.hbo.com/game-of-thrones");
        else if (choice==1)
            webView.loadUrl("https://www.primevideo.com/detail/The-Boys/0KRGHGZCHKS920ZQGY5LBRF7MA");
        else if (choice==2)
            webView.loadUrl("https://www.youtube.com/watch?v=gOXGayDWluo");
        else if (choice==3)
            webView.loadUrl("https://www.youtube.com/watch?v=yK5lZTPHozs");


    }

}