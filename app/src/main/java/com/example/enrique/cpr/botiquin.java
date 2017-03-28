package com.example.enrique.cpr;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Enrique on 3/25/2017.
 */

public class botiquin extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        WebView webview = (WebView) findViewById(R.id.webview_xml);
        webview.loadUrl("file:///android_asset/botiquin.html");
    }
 }