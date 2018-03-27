package com.example.manishabejugam.splashscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import static com.example.manishabejugam.splashscreen.R.id.myviewid;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String myurl="file:///android_asset/index.html";
        WebView view=(WebView) this.findViewById(myviewid);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(myurl);
    }
}
