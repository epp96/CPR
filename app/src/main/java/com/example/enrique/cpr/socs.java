package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by Enrique on 3/5/2017.
 */

public class socs extends AppCompatActivity implements View.OnClickListener {
    Button back;
    Button menu;
    Button consciente;
    Button nocons;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soco);
        back = (Button) findViewById(R.id.back);
        menu = (Button) findViewById(R.id.menu);
        consciente = (Button) findViewById(R.id.cons);
        nocons = (Button) findViewById(R.id.nocons);
        back.setOnClickListener(this);
        menu.setOnClickListener(this);
        consciente.setOnClickListener(this);
        nocons.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()) {
            Intent intent = new Intent(this, emergencia.class);
            startActivity(intent);
        }
        else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        else if (id == consciente.getId()) {
            Intent intent = new Intent(this, consciente.class);
            startActivity(intent);

        }
        else if (id == nocons.getId()) {
            Intent intent = new Intent(this, noconsciente.class);
            startActivity(intent);
        }

    }
}
