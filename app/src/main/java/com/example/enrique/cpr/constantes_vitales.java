package com.example.enrique.cpr;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class constantes_vitales extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        WebView webview = (WebView) findViewById(R.id.webview_xml);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/constantes_vitales.html");
    }
}
