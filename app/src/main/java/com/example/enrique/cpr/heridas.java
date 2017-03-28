package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;


public class heridas extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        WebView webview = (WebView) findViewById(R.id.webview_xml);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/heridas.html");
    }
}
