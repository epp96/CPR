package com.example.enrique.cpr.no_consciente;

/**
 * Created by Enrique on 3/5/2017.
 */

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

import com.example.enrique.cpr.MainActivity;
import com.example.enrique.cpr.R;

public class noconsciente extends AppCompatActivity implements View.OnClickListener {
    Button a;
    Button b;
    Button c;
    Button paradaCardiaca;
    Button atragamiento;
    Button convulsion;
    Button desmayo;
    Button coma;
    Button traumatismo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noconsciente);
        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        paradaCardiaca = (Button) findViewById(R.id.parada);
        atragamiento = (Button) findViewById(R.id.atragar);
        convulsion = (Button) findViewById(R.id.covulsion);
        desmayo = (Button) findViewById(R.id.desmayo);
        coma = (Button) findViewById(R.id.coma);
        traumatismo = (Button) findViewById(R.id.trauma);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        paradaCardiaca.setOnClickListener(this);
        atragamiento.setOnClickListener(this);
        convulsion.setOnClickListener(this);
        desmayo.setOnClickListener(this);
        coma.setOnClickListener(this);
        traumatismo.setOnClickListener(this);
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
                Intent intent = new Intent(this, MainActivity.class);
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
        if (id == a.getId()) {
            Intent intent = new Intent(this, a.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == b.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, b.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == c.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, c.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == paradaCardiaca.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, paradaCardiaca.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == atragamiento.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, atragantamiento.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == convulsion.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, convulsion.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == desmayo.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, desmayo.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == coma.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, coma.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == traumatismo.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, traumatismo.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
}