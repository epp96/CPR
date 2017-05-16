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
    Button consciente;
    Button nocons;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soco);
        consciente = (Button) findViewById(R.id.cons);
        nocons = (Button) findViewById(R.id.nocons);
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
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == consciente.getId()) {
            Intent intent = new Intent(this, com.example.enrique.cpr.consciente.consciente.class);
            startActivity(intent);

        } else if (id == nocons.getId()) {
            Intent intent = new Intent(this, noconsciente.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

    }
}
