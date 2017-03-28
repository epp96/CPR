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
    TextView information;
    String info = "Material de curas e instrumental:\n" +
                        "   - Guantes desechables.\n" +
                        "   - Pinzas.\n" +
                        "   - Termómetro.\n" +
                        "   - Gasas estériles.\n" +
                        "   - Tijeras punta roma.\n" +
                        "   - Esparadrapo.\n" +
                        "   - Tiritas.\n" +
                        "   - Vendas de gasa y elásticas.\n" +
                        "Antisépticos y desinfectantes.\n" +
                        "   - Betadine (povidona yodada).\n" +
                        "   - Cristalmina (Clorhexidina).\n" +
                        "   - Suero fisiológico.\n" +
                        "   - Agua oxigenada.\n" +
                        "Medicamentos\n" +
                        "   - Analgésicos y antitérmicos.\n" +
                        "   - Pomada antiinflamatoria.\n" +
                        "   - Pomada para quemaduras.\n" +
                        "   - Pomada antihistamínica para picaduras.\n" +
                        "Otros\n" +
                        "   - Bolsitas de frio instantáneo.\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.test);
        WebView webview = (WebView) findViewById(R.id.webview_xml);
        webview.loadUrl("file:///android_asset/botiquin.html");
        }
 }