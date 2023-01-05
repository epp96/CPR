package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button emerg;
    Button basic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emerg = (Button) findViewById(R.id.emergencia);
        emerg.setOnClickListener(this);
        basic = (Button) findViewById(R.id.infoB);
        basic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == emerg.getId()) {
            Intent intent = new Intent(this, emergencia.class);
            startActivity(intent);//  initialize it in the manifest
        }
        else if (view.getId() == basic.getId()) {
            Intent intent = new Intent(this, infobasica.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        finish(); // finish activity

    }

}
