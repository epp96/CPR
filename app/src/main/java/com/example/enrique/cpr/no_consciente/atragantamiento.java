package com.example.enrique.cpr.no_consciente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.enrique.cpr.R;

public class atragantamiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        WebView webview = (WebView) findViewById(R.id.webview_xml);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/vacio.html");
    }
}
