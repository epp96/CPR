package com.example.enrique.cpr.consciente;

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

/**
 * Created by Enrique on 3/5/2017.
 */

public class consciente extends AppCompatActivity implements View.OnClickListener{
    Button back;
    Button menu;
    Button calor;
    Button quemaduras;
    Button atragamiento;
    Button hemorragia;
    Button herida;
    Button envenenamiento;
    Button fractura;
    Button golpes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consciente);
        back = (Button) findViewById(R.id.back);
        menu = (Button) findViewById(R.id.menu);
        calor = (Button) findViewById(R.id.golpecalor);
        quemaduras = (Button) findViewById(R.id.fuego);
        atragamiento = (Button) findViewById(R.id.atraga);
        hemorragia = (Button) findViewById(R.id.hemo);
        herida = (Button) findViewById(R.id.herida);
        envenenamiento = (Button) findViewById(R.id.veneno);
        fractura = (Button) findViewById(R.id.fractura);
        golpes = (Button) findViewById(R.id.golpes);
        back.setOnClickListener(this);
        menu.setOnClickListener(this);
        calor.setOnClickListener(this);
        quemaduras.setOnClickListener(this);
        atragamiento.setOnClickListener(this);
        hemorragia.setOnClickListener(this);
        herida.setOnClickListener(this);
        envenenamiento.setOnClickListener(this);
        fractura.setOnClickListener(this);
        golpes.setOnClickListener(this);
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
        return super.onOptionsItemSelected(item);    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()){
           /* Intent intent = new Intent(this, socs.class);
            startActivity(intent);*/
            finish();
        }
        else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else if (id == calor.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, golpedecalor.class);
            startActivity(intent);
        }
        else if (id == quemaduras.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, quemaduras.class);
            startActivity(intent);
        }
        else if (id == atragamiento.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, atragantamiento.class);
            startActivity(intent);
        }
        else  if (id == hemorragia.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, hemorragias.class);
            startActivity(intent);
        }
        else  if (id == herida.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, heridas.class);
            startActivity(intent);
        }
        else if (id == envenenamiento.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, envenenamiento.class);
            startActivity(intent);
        }
        else if (id == fractura.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, fracturas.class);
            startActivity(intent);
        }
        else if (id == golpes.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, golpes.class);
            startActivity(intent);
        }

    }
}
