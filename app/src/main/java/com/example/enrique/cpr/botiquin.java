package com.example.enrique.cpr;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Enrique on 3/25/2017.
 */

public class botiquin extends AppCompatActivity {
    TextView information;
    String htmlAsString = getString(R.string.botiquin_contenido_html);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(Html.fromHtml(htmlAsString));

    }
}
