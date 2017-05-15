package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.enrique.cpr.no_consciente.noconsciente;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Toast.makeText(this, "Menu Item 1 selected", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()) {
            /*Intent intent = new Intent(this, emergencia.class);
            startActivity(intent);*/
            finish();
        } else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == consciente.getId()) {
            Intent intent = new Intent(this, com.example.enrique.cpr.consciente.consciente.class);
            startActivity(intent);

        } else if (id == nocons.getId()) {
            Intent intent = new Intent(this, noconsciente.class);
            startActivity(intent);
        }

    }
}
